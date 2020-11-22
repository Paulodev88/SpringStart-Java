package com.sourceforlife.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sourceforlife.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
