package com.hrms.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.hrms.business.abstracts.TegnologyService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.Tegnology;

@CrossOrigin
@RestController
@RequestMapping("/api/tegnologies/")
public class TegnologyController {

	
	private TegnologyService tegnologyService;

	@Autowired
	public TegnologyController(TegnologyService tegnologyService) {
		super();
		this.tegnologyService = tegnologyService;
	}

	@GetMapping("getAll")
	public DataResult<List<Tegnology>> getAll(){
		return this.tegnologyService.getAll();
	}
	
	@PostMapping("add")
	public Result add(Tegnology tegnology) {
		return this.tegnologyService.add(tegnology);
	}
	
}
