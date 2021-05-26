package com.hrms.hrms.core.utilities.helper;

import com.hrms.hrms.entities.concretes.JobSeeker;

public class JobSeekerCheckHelper {
	public static boolean allFieldsAreRequired(JobSeeker jobSeeker ){
		if(jobSeeker.getFirstName().isEmpty()
				|| jobSeeker.getLastName().isEmpty()
				|| jobSeeker.getIdentityNumber().isEmpty()
				|| jobSeeker.getEmail().isEmpty()
				|| jobSeeker.getPassword().isEmpty()
				|| jobSeeker.getRepeatOfPassword().isEmpty()) 
        {
            return false;
        }
        return true;
    }
}
