package com.web.webService.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.webService.entities.User;
import com.web.webService.repositories.UserRepository;

public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
}
