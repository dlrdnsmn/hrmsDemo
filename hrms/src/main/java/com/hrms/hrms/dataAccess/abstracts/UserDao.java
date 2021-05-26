package com.hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.hrms.entities.concretes.Users;

public interface UserDao extends JpaRepository<Users, Integer>{

	Users findByEmail(String email);
	
}
