package com.web.webService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.webService.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(null, "Jonas", "Jonas@gmail.com", "999999", "1234");
		return ResponseEntity.ok().body(u);
	}
}
