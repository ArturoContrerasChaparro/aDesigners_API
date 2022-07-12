package org.aDesigners.aDesignersProject.controller;


import java.util.List;

import org.aDesigners.aDesignersProject.model.User;
import org.aDesigners.aDesignersProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping (path="/api/users/")
public class UserController {
	private final UserService userService;
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}// constructor
	
	//CRUD
	@GetMapping
	public List<User> getAllUsers(){
		return userService.getUsers();
	}//getAllUsers
	
	
	@GetMapping(path="{userId}")
	public User getUser(@PathVariable("userId") Long id){
		return userService.getUser(id);
	}//getUser
	
	@DeleteMapping(path="{userId}")
	public User deleteUser(@PathVariable("userId") Long id){
		return userService.deleteUser(id);
	}//deleteUser
	
	@PostMapping
	public User addUser(@RequestBody User user){
		return userService.addUser(user);
	}//addUser
	
	@PutMapping(path="{userId}")
	public User updateUser(@PathVariable("userId") Long id,
			@RequestParam(required = false) String nombre,
			@RequestParam(required = false) String correo,
			@RequestParam(required = false) String tel,
			@RequestParam(required = false) String contrasena) {
		return userService.updateUser(id, nombre, correo, tel, contrasena);
	}//updateUser
	
}//class ProdictpController