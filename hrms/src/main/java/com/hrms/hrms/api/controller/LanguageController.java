package com.hrms.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.hrms.business.abstracts.LanguageService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.Language;

@CrossOrigin
@RestController
@RequestMapping("/api/languages/")
public class LanguageController {
	private LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}

	@GetMapping("getAll")
	public DataResult<List<Language>> getAll() {
		return this.languageService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody Language language) {
		return this.languageService.add(language);
	}

}
