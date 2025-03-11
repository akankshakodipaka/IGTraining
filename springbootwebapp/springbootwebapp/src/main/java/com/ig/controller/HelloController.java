package com.ig.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/home")
	public String getHelloMessage() {
		return "Hello";
	}

	@GetMapping("/welcome")
	public String getWelcomeMessage() {
		return "Welcome to SpringBoot Web Application";
	}
	
}
