package com.hrms.hrms.business.concretes;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hrms.hrms.business.abstracts.CvService;
import com.hrms.hrms.core.utilities.cloudinary.CloudinaryService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.ErrorResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.core.utilities.results.SuccessResult;
import com.hrms.hrms.dataAccess.abstracts.CvDao;
import com.hrms.hrms.entities.concretes.Candidate;
import com.hrms.hrms.entities.concretes.Cv;

@Service
public class CvManager implements CvService {

	private CvDao cvDao;
	private final CloudinaryService cloudinaryService;

	public CvManager(CvDao cvDao, CloudinaryService cloudinaryService) {
		super();
		this.cvDao = cvDao;
		this.cloudinaryService = cloudinaryService;
	}

	public Result add(Cv cv) {
		this.cvDao.save(cv);
		return new SuccessResult("Cv eklendi");
	}

	public DataResult<List<Cv>> getAllByCandidate(Candidate candidate) {
		return new SuccessDataResult<List<Cv>>(this.cvDao.findByCandidate_Id(candidate.getId()), "CV Listelendi");
	}

	public Result uploadImage(MultipartFile multipartFile, int resumeId) {
	        try {
	            String filePath = this.cloudinaryService.upload(multipartFile).getData().get("url").toString();

	            Cv tempResume = cvDao.getOne(resumeId);
	            tempResume.setImgUrl(filePath);
	            cvDao.save(tempResume);

	            return new SuccessResult("Uploaded");
	        } catch (IOException e) {
	            return new ErrorResult("Exception: " + e.getMessage());
	        }

}
}
