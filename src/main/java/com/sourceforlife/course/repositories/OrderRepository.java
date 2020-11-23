package com.sourceforlife.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sourceforlife.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
