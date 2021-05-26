package com.hrms.hrms.core.utilities.helper;

import com.hrms.hrms.entities.concretes.Employers;

public class EmployerCheckHelper {
	public static boolean allFieldsAreRequired(Employers employer ){
		if(employer.getCompanyName().isEmpty()
				|| employer.getWebSite().isEmpty()
				|| employer.getEmail().isEmpty()
				|| employer.getPassword().isEmpty()
				|| employer.getPhoneNumber().isEmpty()
				|| employer.getRepeatOfPassword().isEmpty()) 
        {
            return false;
        }
        return true;
    }
}
