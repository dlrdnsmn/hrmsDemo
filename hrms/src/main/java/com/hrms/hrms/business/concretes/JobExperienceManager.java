package com.hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.JobExperienceService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.core.utilities.results.SuccessResult;
import com.hrms.hrms.dataAccess.abstracts.JobExperienceDao;
import com.hrms.hrms.entities.concretes.JobExperience;

@Service
public class JobExperienceManager implements JobExperienceService{

	private JobExperienceDao jobExperienceDao;
	
	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}
	
	public Result add(JobExperience experience) {
		this.jobExperienceDao.save(experience);
		return new SuccessResult("Job experience added.");
	}
	
	public DataResult<List<JobExperience>> getAll() {		
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.findAll(), "Data listed.");
	}
	
	public DataResult<List<JobExperience>> getAllSorted() {
		Sort sort=Sort.by(new Sort.Order(Sort.Direction.DESC, "finishDate", Sort.NullHandling.NULLS_FIRST));
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.findAll(sort), "Data listed.");
	}

	
}
