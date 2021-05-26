package com.hrms.hrms.core.abstracts;

import com.hrms.hrms.entities.concretes.Users;

public interface SystemPersonelValidationService {

	boolean isActivated(Users user);
}
