package org.backend.backend.services;

import java.util.ArrayList;

import org.backend.backend.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
public final ArrayList<User> lista = new ArrayList <User>();
	
	public UserService() {
		lista.add(new User ("Omar Martinez", "omartinez2343@gmail.com", "6394657312", "pajaroazul2") );
		lista.add(new User ("Jesus Lerma", "jesusomartrco@hotmail.com", "6391234512", "lerma1995") );
		lista.add(new User ("Edir Beltran", "superedir12pro@gmail.com", "6148761232", "ireliaflow") );
		lista.add(new User ("Bryan Alonso", "noobmaster69thortillero@gmail.com", "6564531232", "diosdeltrueno") );
		lista.add(new User ("Fernando Montemayor", "fermontegrande@hotmail.com", "6291102343", "Fer34SD") );
		}// constructor
	
	public ArrayList<User> getUsers(){
		return lista;
	}
	public User getUser(Long id) {
	User tmpUser = null;
		for (User user : lista) {
		if(user.getId()==id) {
			tmpUser= user;
			break;
		}//if
	}//foreach
		return tmpUser;
	}// getProducto
	
	public User addUser(User user) {
		lista.add(user);
		return user;
	}//addProducto
}
