package com.hrms.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.hrms.business.abstracts.JobTitleService;
import com.hrms.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/jobtitles")

public class JobTitlesController {

	private JobTitleService jobtitleService;
	
	@Autowired
	public JobTitlesController(JobTitleService jobtitleService) {
		super();
		this.jobtitleService = jobtitleService;
	}
	
	@GetMapping("/getall")
	public List<JobTitle>getAll(){
		return this.jobtitleService.getAll();
	}
}