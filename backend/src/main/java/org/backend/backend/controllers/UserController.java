package org.backend.backend.controllers;


import java.util.List;

import org.backend.backend.User;
import org.backend.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping (path="/users/")
public class UserController {
	private final UserService userService;
	//aqui me quede
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}// constructor
	
	//CRUD
	@GetMapping
	public List<User> getAllUsers(){
		return userService.getUsers();
	}//getAllUsers
	
	
	@PostMapping
	public User addUser(@RequestBody User user){
		return userService.addUser(user);
	}//addUser
	
	
	
}//class ProdictpController