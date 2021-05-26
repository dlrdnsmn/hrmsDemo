package com.hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.SystemPersonelService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.dataAccess.abstracts.JobSeekerDao;
import com.hrms.hrms.dataAccess.abstracts.SystemPersonelDao;
import com.hrms.hrms.entities.concretes.SystemPersonel;


@Service
public class SystemPersonelManager implements SystemPersonelService {
	private SystemPersonelDao systemPersonnelDao;

	@Autowired
	public SystemPersonelManager(SystemPersonelDao systemPersonelDao) {
		super();
		this.systemPersonnelDao = systemPersonnelDao;
	}


	public DataResult<List<SystemPersonel>> getAll() {
		return new SuccessDataResult<List<SystemPersonel>>(this.systemPersonnelDao.findAll(), "Listeleme Başarılı");
	}
}