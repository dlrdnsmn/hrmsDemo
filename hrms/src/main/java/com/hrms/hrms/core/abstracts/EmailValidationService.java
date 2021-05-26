package com.hrms.hrms.core.abstracts;

import com.hrms.hrms.entities.concretes.Users;

public interface EmailValidationService {

	boolean isActivat(Users user); 
	
}
