package com.hrms.hrms.core.adapters;

import org.springframework.stereotype.Service;

import com.hrms.hrms.core.abstracts.MernisValidationService;
import com.hrms.hrms.entities.concretes.JobSeeker;

@Service
public class MernisServiceAdapter  implements MernisValidationService{

	
	public boolean validate(JobSeeker jobSeeker)  {
		// FAKE DOĞRULAMA SİSTEMİDİR.
//			KPSPublicSoap soapClient = new KPSPublicSoapProxy();
//			boolean result = false;
//			  try {
//				  result = soapClient.TCKimlikNoDogrula(Long.parseLong(jobSeeker.getIdentityNumber()), jobSeeker.getFirstName(), jobSeeker.getLastName(), jobSeeker.getDateOfBirth().getYear());
//			  } catch (NumberFormatException e) {
//				   e.printStackTrace();
//			  } catch (RemoteException e) {
//			       e.printStackTrace();
//			  }
//			 return result;
//		}

		return false;
	}
	
	
}