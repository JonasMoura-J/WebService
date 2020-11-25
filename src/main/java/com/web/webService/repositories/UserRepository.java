package com.web.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.webService.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
