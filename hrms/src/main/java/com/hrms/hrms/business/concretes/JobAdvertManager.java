package com.hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.JobAdvertService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.core.utilities.results.SuccessResult;
import com.hrms.hrms.dataAccess.abstracts.JobAdvertsDao;
import com.hrms.hrms.entities.concretes.JobAdverts;

@Service
public class JobAdvertManager implements JobAdvertService {

	private  JobAdvertsDao jobAdvertsDao;
	
	@Autowired
	public JobAdvertManager(JobAdvertsDao jobAdvertsDao) {
		this.jobAdvertsDao = jobAdvertsDao;
	}

	public DataResult<List<JobAdverts>> getJobAdverts() {
		return new SuccessDataResult<List<JobAdverts>>(this.jobAdvertsDao.findAll(), "İlanlar listelenmiştir");
	}

	public DataResult<List<JobAdverts>> getActiveJobAdverts() {
		return new SuccessDataResult<List<JobAdverts>>(this.jobAdvertsDao.findAllByIsActiveTrue(),"Aktif ilanlar listelendi.");
	}

	 public DataResult<List<JobAdverts>> getActiveJobAdvertsSorted() {
	        Sort sort = Sort.by(Sort.Direction.DESC, "opened_Date");
	        return new SuccessDataResult<List<JobAdverts>>(this.jobAdvertsDao.findAll(sort), "Aktif tüm iş ilanları listelendi(DESC)!");
	    }

	public DataResult<List<JobAdverts>> getActiveJobAdvertsForEmployer(String companyName) {
		 return new SuccessDataResult<List<JobAdverts>>(
	                this.jobAdvertsDao.getJobAdvertsByIsActiveTrueAndEmployers_CompanyName(companyName),
	                "Success: Şirket'e ait tüm ilanlar listelendi");
	}

	public Result deactiveJobAdvert(int jobAdvertId) {
		 this.jobAdvertsDao.deactiveJobAdvert(jobAdvertId);
	        return new SuccessResult("İlan başarıyla pasif edildi!");
	}

	public Result addJobAdvert(JobAdverts jobAdvert) {
		 this.jobAdvertsDao.save(jobAdvert);
	        return new SuccessResult("İlan sisteme eklendi!");
	}

}
