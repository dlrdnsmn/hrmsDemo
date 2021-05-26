package com.hrms.hrms.core.adapters;

import org.springframework.stereotype.Service;

import com.hrms.hrms.core.abstracts.EmailValidationService;
import com.hrms.hrms.entities.concretes.Users;

@Service
public class EmailValidationAdapter implements EmailValidationService {
	
	public boolean isActivat(Users user) {
		return true;
	}
}