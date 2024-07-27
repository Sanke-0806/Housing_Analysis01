package com.example.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.main.Repository.UserRepository;
import com.example.main.entity.User;

@Controller
public class Usercontroller {

	UserRepository userservice ;
	
	@GetMapping("/")
	public String form() {
		return "form";
	}
	
	@PostMapping("/register")
	public void regiter(@ModelAttribute User user) {
		userservice.save(user);
	}
	
	
}
