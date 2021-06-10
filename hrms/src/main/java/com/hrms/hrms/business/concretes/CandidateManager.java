package com.hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.CandidateService;
import com.hrms.hrms.core.abstracts.MernisValidationService;
import com.hrms.hrms.core.adapters.EmailValidationAdapter;
import com.hrms.hrms.core.utilities.helper.JobSeekerCheckHelper;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.ErrorResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.core.utilities.results.SuccessResult;
import com.hrms.hrms.dataAccess.abstracts.CandidateDao;
import com.hrms.hrms.dataAccess.abstracts.UserDao;
import com.hrms.hrms.entities.concretes.Candidate;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CandidateManager implements CandidateService {
	private CandidateDao jobSeekerDao;
	private UserDao userDao;
	private EmailValidationAdapter emailValidationAdapter;
	private MernisValidationService mernisValidationService;

	
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.jobSeekerDao.findAll(), "Listeleme Başarılı");
	}


	public Result add(Candidate candidate) {
		if (!JobSeekerCheckHelper.allFieldsAreRequired(candidate)) {
			return new ErrorResult("Tüm alanları doldurunuz");
			
		}else if(!candidate.getPassword().equals(candidate.getRepeatOfPassword())) {
			return new ErrorResult("Şifreler Uyuşmamaktadır ");
			
		}else if(!mernisValidationService.validate(candidate)) {
			return new SuccessResult("Doğrulama Başarısız !");
			
		}else if(userDao.findByEmail(candidate.getEmail()) != null 
				|| jobSeekerDao.findByIdentityNumber(candidate.getIdentityNumber())!= null) {
			return new ErrorResult("Kullanıcı Kayıtlı!");
			
		}else if(!emailValidationAdapter.isActivat(candidate)) {
			return new ErrorResult("Aktivasyon kodu yanlış");
			
		}else {
			this.jobSeekerDao.save(candidate);
			return new SuccessResult("Kayıt Başarılı");
		}			
	}

}
