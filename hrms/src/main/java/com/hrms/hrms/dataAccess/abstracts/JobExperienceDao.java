package com.hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.hrms.entities.concretes.JobExperience;
import com.hrms.hrms.entities.concretes.Tegnology;

public interface JobExperienceDao extends JpaRepository<JobExperience, Integer>{

}
