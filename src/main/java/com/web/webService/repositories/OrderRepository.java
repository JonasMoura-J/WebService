package com.web.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.webService.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}
