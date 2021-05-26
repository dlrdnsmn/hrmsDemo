package com.hrms.hrms.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.hrms.business.abstracts.SystemPersonelService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.entities.concretes.SystemPersonel;

@RestController
@RequestMapping("/api/system-personnel")
public class SystemPersonelController {
	private SystemPersonelService systemPersonelService;

	@Autowired
	public SystemPersonelController(SystemPersonelService systemPersonnelService) {
		super();
		this.systemPersonelService = systemPersonnelService;
	}

	@GetMapping("/getall")
	public DataResult<List<SystemPersonel>> getAll() {
		return this.systemPersonelService.getAll();
	}

}