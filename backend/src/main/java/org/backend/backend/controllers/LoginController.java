package org.backend.backend.controllers;


import java.util.List;

import org.backend.backend.Login;
import org.backend.backend.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping (path="/login/")
public class LoginController {
	private final LoginService loginService;
	
	@Autowired
	public LoginController(LoginService loginService) {
		this.loginService = loginService;
	}// constructor
	
	//CRUD
	@GetMapping
	public List<Login> getAllLogins(){
		return loginService.getLogins();
	}//getAllUsers
	
	
	@PostMapping
	public Login addLogin(@RequestBody Login login){
		return loginService.addLogin(login);
	}//addUser
	
	
	
	
}
