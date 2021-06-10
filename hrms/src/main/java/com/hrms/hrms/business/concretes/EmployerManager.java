package com.hrms.hrms.business.concretes;

import java.util.List;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.EmployerService;
import com.hrms.hrms.core.adapters.EmailValidationAdapter;
import com.hrms.hrms.core.adapters.SystemPersonelValidationAdapter;
import com.hrms.hrms.core.utilities.helper.EmployerCheckHelper;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.ErrorResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.core.utilities.results.SuccessResult;
import com.hrms.hrms.dataAccess.abstracts.EmployerDao;
import com.hrms.hrms.dataAccess.abstracts.UserDao;
import com.hrms.hrms.entities.concretes.Employers;

import java.util.regex.Pattern;

@Service
@AllArgsConstructor
public class EmployerManager implements EmployerService {
	private EmployerDao employerDao;
	private UserDao userDao;
	private EmailValidationAdapter emailValidationAdapter;
	private SystemPersonelValidationAdapter systemPersonnelValidationAdapter;

	
	public DataResult<List<Employers>> getAll() {
		return new SuccessDataResult<List<Employers>>(this.employerDao.findAll(),"Listeleme Başarılı");
	}
	
	
	public Result add(Employers employer) {
		
		if(!EmployerCheckHelper.allFieldsAreRequired(employer)) {
			return new ErrorResult("Tüm alanları doldurmalısınız.");
			
		}else if(!isEmailFormatValid(employer)) {
			return new ErrorResult("Email herhangi bir şirkete ait değildir.");
			
		}else if(!employer.getPassword().equals(employer.getRepeatOfPassword())) {
			return new ErrorResult("Şifreler Uyuşmamaktadır.");
			
		}else if(userDao.findByEmail(employer.getEmail()) != null) {
			return new ErrorResult("Kullanıcı Zaten Kayıtlıdır.Yeni kullanıcı oluşturabilirsiniz.");
			
		}else if(!(emailValidationAdapter.isActivat(employer)
				&& systemPersonnelValidationAdapter.isActivated(employer))) {
			return new ErrorResult("Aktivasyon Sağlanmadı.");
			
		}else {
			this.employerDao.save(employer);
			return new SuccessResult("Kayıt Başarılı Olarak Tamamlandı.");
		}
	}
	
	
	private boolean isEmailFormatValid(Employers employer) {
		String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@"+employer.getWebSite();
		Pattern pattern = java.util.regex.Pattern.compile(EMAIL_PATTERN,
		Pattern.CASE_INSENSITIVE);
		return pattern.matcher(employer.getEmail()).find();	
	}
}