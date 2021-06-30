package com.hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.CityService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.dataAccess.abstracts.CityDao;
import com.hrms.hrms.entities.concretes.Cities;

@Service
public class CityManager implements CityService{


	public CityDao cityDao;

	@Autowired
	public CityManager(CityDao cityDao) {
	    this.cityDao = cityDao;
	}
   
    public DataResult<List<Cities>> getAll() {
        return new SuccessDataResult<List<Cities>>(cityDao.findAll(),"Şehirler Getirildi");
    }
		
	}


