package com.hrms.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hrms.hrms.business.abstracts.CvService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.Candidate;
import com.hrms.hrms.entities.concretes.Cv;

@RestController
@RequestMapping("/api/cv")
public class CvController {
	
	private CvService cvService;

	@Autowired
	public CvController(CvService cvService) {
		super();
		this.cvService = cvService;
	}
	
	@GetMapping("getAllByCandidateId")
	public DataResult<List<Cv>> getAllByCandidate(@RequestParam Candidate candidate){
		return this.cvService.getAllByCandidate(candidate);
	}
	
	@PostMapping("/uploadimage")
    public Result uploadImage(@RequestBody MultipartFile file, @RequestParam int resumeId){
        return this.cvService.uploadImage(file, resumeId);
    }

}
