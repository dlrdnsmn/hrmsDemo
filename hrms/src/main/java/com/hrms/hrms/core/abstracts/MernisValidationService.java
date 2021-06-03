package com.hrms.hrms.core.abstracts;

import com.hrms.hrms.entities.concretes.Candidate;

public interface MernisValidationService {

	boolean validate(Candidate jobSeeker);
}
