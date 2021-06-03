package com.hrms.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.hrms.business.abstracts.CandidateService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.Candidate;

@RestController
@RequestMapping("/api/job-seeker")
public class CandidateController {
	private CandidateService jobSeekerService;

	@Autowired
	public CandidateController(CandidateService jobSeekerService) {
		this.jobSeekerService = jobSeekerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Candidate>> getAll(){
		return this.jobSeekerService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Candidate jobSeeker) {
		return this.jobSeekerService.add(jobSeeker);
	}
}
