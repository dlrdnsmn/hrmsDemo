package com.hrms.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.UserService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.dataAccess.abstracts.UserDao;
import com.hrms.hrms.entities.concretes.Users;


import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class UserManager implements UserService {

	private UserDao userDao;

	
	public DataResult<List<Users>> getAll() {
		
		return new SuccessDataResult<List<Users>>(this.userDao.findAll(),"Listeleme Başarılı");
	}
	

}