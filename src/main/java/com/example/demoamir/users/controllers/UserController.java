package com.example.demoamir.users.controllers;

import com.example.demoamir.users.models.User;
import com.example.demoamir.users.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

	private UserService userService;
	@GetMapping("/")
	public  ResponseEntity mainRoute (){
		System.out.println("hello");
		return null ;
	}

	@GetMapping("/login")
	public String viewLoginPage(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}

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
