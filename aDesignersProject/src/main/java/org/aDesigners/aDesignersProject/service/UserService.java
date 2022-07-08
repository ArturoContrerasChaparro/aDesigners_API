package org.aDesigners.aDesignersProject.service;

import java.util.List;
import java.util.Optional;

import org.aDesigners.aDesignersProject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	private final UserRepository userRepository;
	   // repositorio dentro de productoservice para conectarse a base de datos
		@Autowired
		public UserService(UserRepository userRepository) {
			this.userRepository = userRepository;
		}// constructor
		
		public List<User> getUsers() {
			return userRepository.findAll();
		}//getUsers
		
		public User getUser(Long id) {
			return userRepository.findById(id).orElseThrow(
					()->new IllegalArgumentException("Ël usuario con el id "+ id + " no existe."));
		}//getUser

		public User deleteUser(Long id) {
			User tmpUser = null;
			if (userRepository.existsById(id)) {
				tmpUser = userRepository.findById(id).get();
				userRepository.deleteById(id);
			}//if exist
			return tmpUser;
		}//deleteUser
		
		public User addUser(User user) {
			User tmpUser = null;
			Optional<User> userByName = userRepository.findByNombre(user.getNombre());
			
			if (userByName.isPresent()) {
				throw new IllegalArgumentException("Ël usuario con el nombre ["+user.getNombre() + "] ya existe.");
			} else {
				userRepository.save(user);
				tmpUser = user;
			}//else //if isPresent
			return tmpUser;
		}//addUser
		
		public User updateUser(Long id, String nombre, String correo, String tel, String contrasena) {
			User tmpUser = null;
			if(userRepository.existsById(id)) {
				tmpUser= userRepository.findById(id).get();
				if(nombre!=null) tmpUser.setNombre(nombre);
				if(correo!=null) tmpUser.setCorreo(correo);
				if(tel!=null) tmpUser.setTel(tel);
				if(contrasena!=null) tmpUser.setContrasena(contrasena);
				
				userRepository.save(tmpUser);
			} else {
				System.out.println("El usuario con el id " + id + " no existe." );
				
			}//if
			return tmpUser;
		}//updateUser
}//class UserService
