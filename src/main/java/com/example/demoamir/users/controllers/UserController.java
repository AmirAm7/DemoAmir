package com.example.demoamir.users.controllers;

import com.example.demoamir.users.models.User;
import com.example.demoamir.users.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private UserService userService;
	@GetMapping("/")
	public  ResponseEntity mainRoute (){
		System.out.println("hello");
		return null ;
	}
/*	@GetMapping("/login")
	public ResponseEntity login (){
		System.out.println("hello");
		return null ;
	}*/

	@GetMapping("/testAuth")
	public  ResponseEntity testAuthRoute (){
		System.out.println("hello2");
		return null ;
	}

	@GetMapping("/user")
	public  ResponseEntity <User> getAllUsers (){

		userService.findAll();
		return null;
	}
}
