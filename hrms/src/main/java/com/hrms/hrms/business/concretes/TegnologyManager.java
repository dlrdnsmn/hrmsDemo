package com.hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.TegnologyService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.core.utilities.results.SuccessResult;
import com.hrms.hrms.dataAccess.abstracts.TegnologyDao;
import com.hrms.hrms.entities.concretes.Tegnology;

@Service
public class TegnologyManager implements TegnologyService{
private TegnologyDao tegnologyDao;

	public TegnologyManager(TegnologyDao tegnologyDao) {
	super();
	this.tegnologyDao = tegnologyDao;

	}

	public Result add(Tegnology tegnology) {
		this.tegnologyDao.save(tegnology);
		return new SuccessResult("Tegnology added.");
	}

	public DataResult<List<Tegnology>> getAll() {
		return new SuccessDataResult<List<Tegnology>>(this.tegnologyDao.findAll(),"Data listed.");
	}
}