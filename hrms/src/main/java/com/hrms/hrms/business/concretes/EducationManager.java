package com.hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.EducationService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.core.utilities.results.SuccessResult;
import com.hrms.hrms.dataAccess.abstracts.EducationDao;
import com.hrms.hrms.entities.concretes.Education;

@Service
public class EducationManager implements EducationService{

	private EducationDao educationDao;
	
	public EducationManager(EducationDao educationDao) {
		super();
		this.educationDao = educationDao;
	}

	public Result add(Education education) {
		this.educationDao.save(education);
		return new SuccessResult("Education eklendi");
	}

	public DataResult<List<Education>> getAll() {
		return new SuccessDataResult<List<Education>>(this.educationDao.findAll(),"Data listed.");

	}

	public DataResult<List<Education>> getAllSorted() {
		Sort sort=Sort.by(new Sort.Order(Sort.Direction.DESC, "schoolFinishDate", Sort.NullHandling.NULLS_FIRST));
		return new SuccessDataResult<List<Education>>(this.educationDao.findAll(sort),"Data listed.");
	
	}

}
