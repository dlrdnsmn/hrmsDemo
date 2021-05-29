package com.hrms.hrms.business.abstracts;

import java.util.List;

import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.JobAdverts;

public interface JobAdvertService {

	DataResult<List<JobAdverts>> getJobAdverts();

	DataResult<List<JobAdverts>> getActiveJobAdverts();

	DataResult<List<JobAdverts>> getActiveJobAdvertsSorted();

	DataResult<List<JobAdverts>> getActiveJobAdvertsForEmployer(String companyName);

	Result deactiveJobAdvert(int jobAdvertId);

	Result addJobAdvert(JobAdverts jobAdvert);

}
