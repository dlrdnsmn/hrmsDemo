package com.hrms.hrms.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.hrms.business.abstracts.EmployerService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.Employers;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("/api/employer")
@AllArgsConstructor
public class EmployerController {
	private EmployerService employerService;

	
	@GetMapping("/getall")
	public DataResult<List<Employers>> getAll(){
		return this.employerService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employers employer) {
		return this.employerService.add(employer);
	}
	
}