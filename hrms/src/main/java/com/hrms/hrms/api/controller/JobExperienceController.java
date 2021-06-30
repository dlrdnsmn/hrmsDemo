package com.hrms.hrms.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.hrms.business.abstracts.JobExperienceService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.JobExperience;

@CrossOrigin
@RestController
@RequestMapping("/api/experiences/")
public class JobExperienceController {

	private JobExperienceService jobExperienceService;

	@Autowired
	public JobExperienceController(JobExperienceService jobExperienceService) {
		super();
		this.jobExperienceService = jobExperienceService;
	}
	
	
	@GetMapping("getAll")
	public DataResult<List<JobExperience>> getAll(){
		return this.jobExperienceService.getAll();
	}
	@PostMapping("add")
	public Result add(JobExperience experience) {
		return this.jobExperienceService.add(experience);
	}
	@GetMapping("getAllSorted")
	public DataResult<List<JobExperience>> getAllSorted(){
		return this.jobExperienceService.getAllSorted();
	}

}
