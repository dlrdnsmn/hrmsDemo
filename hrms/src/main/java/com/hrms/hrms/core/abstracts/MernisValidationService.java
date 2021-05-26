package com.hrms.hrms.core.abstracts;

import com.hrms.hrms.entities.concretes.JobSeeker;

public interface MernisValidationService {

	boolean validate(JobSeeker jobSeeker);
}
