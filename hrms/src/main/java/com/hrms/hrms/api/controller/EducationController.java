package com.hrms.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.hrms.business.abstracts.EducationService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.Education;

@RestController
@RequestMapping("/api/educations")
public class EducationController {

	private EducationService educationService;

	@Autowired
	public EducationController(EducationService educationService) {
		super();
		this.educationService = educationService;
	}
	
	@GetMapping("getAll")
	public DataResult<List<Education>> getAll(){
		return this.educationService.getAll();
	}
	
	@GetMapping("getAllSorted")
	public DataResult<List<Education>> getAllSorted(){
		return this.educationService.getAllSorted();
	}
	
	@PostMapping("add")
	public Result add(Education education) {
		return this.educationService.add(education);
	}
}
