package com.hrms.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.Candidate;
import com.hrms.hrms.entities.concretes.Cv;

public interface CvService {

	Result add(Cv cv);
	DataResult<List<Cv>> getAllByCandidate(Candidate candidate);
	Result uploadImage(MultipartFile multipartFile, int resumeId);
}
