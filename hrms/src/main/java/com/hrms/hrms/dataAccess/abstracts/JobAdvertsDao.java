package com.hrms.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hrms.hrms.entities.concretes.JobAdverts;

public interface JobAdvertsDao extends JpaRepository<JobAdverts, Integer>{

	List<JobAdverts> findAllByIsActiveTrue();
	
	List<JobAdverts> getJobAdvertsByIsActiveTrueAndEmployers_CompanyName(String companyName);
	
	@Query("Update JobAdverts set isActive=false where id=:jobAdvertId")
	void deactiveJobAdvert(int jobAdvertId);
}
