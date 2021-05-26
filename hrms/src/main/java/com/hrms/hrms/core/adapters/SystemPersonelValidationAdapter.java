package com.hrms.hrms.core.adapters;

import org.springframework.stereotype.Service;

import com.hrms.hrms.core.abstracts.SystemPersonelValidationService;
import com.hrms.hrms.entities.concretes.Users;

@Service
public class SystemPersonelValidationAdapter implements SystemPersonelValidationService {
	
	public boolean isActivated(Users user) {
		return true;
	}
	


}
