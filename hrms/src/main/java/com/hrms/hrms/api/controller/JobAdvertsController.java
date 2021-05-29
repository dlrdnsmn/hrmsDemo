package com.hrms.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.hrms.business.abstracts.JobAdvertService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.JobAdverts;

@RestController
@RequestMapping("/api/jobadverts")
public class JobAdvertsController {
	private JobAdvertService jobAdvertService;

	@Autowired
	public JobAdvertsController(JobAdvertService jobAdvertService) {
		this.jobAdvertService = jobAdvertService;
	}
	
	@GetMapping("/getJobAdverts")
	public DataResult<List<JobAdverts>> getJobAdverts(){
		return this.jobAdvertService.getJobAdverts();
	}
	
	@GetMapping("/getActiveJobAdverts")
	public DataResult<List<JobAdverts>> getActiveJobAdverts(){
		return this.jobAdvertService.getActiveJobAdverts();
	}
	
	@GetMapping("/getActiveJobAdvertsSorted")
	public DataResult<List<JobAdverts>> getActiveJobAdvertsSorted(){
		return this.jobAdvertService.getActiveJobAdvertsSorted();
	}
	
	@GetMapping("/getJobAdvertsForCompanyName")
	 public DataResult<List<JobAdverts>> getActiveJobAdvertsForEmployer(String companyName) {
        return this.jobAdvertService.getActiveJobAdvertsForEmployer(companyName);
    }
	
	@PostMapping("/addJobAdvert")
	public Result addJobAdverts(@RequestBody JobAdverts jobAdverts){
		return this.jobAdvertService.addJobAdvert(jobAdverts);
	}
	

}
