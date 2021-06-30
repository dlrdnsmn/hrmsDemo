package com.hrms.hrms.business.concretes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.WayOfWorkingService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.dataAccess.abstracts.WayOfWorkingDao;
import com.hrms.hrms.entities.concretes.WayOfWorking;
import com.hrms.hrms.entities.concretes.WorkingTime;

import java.util.List;

@Service
public class WayOfWorkingManager implements WayOfWorkingService {


    private WayOfWorkingDao wayOfWorkingDao;

    @Autowired
    public WayOfWorkingManager(WayOfWorkingDao wayOfWorkingDao) {
        this.wayOfWorkingDao = wayOfWorkingDao;
    }
    
    public DataResult<List<WayOfWorking>> getAll() {
       
        return new SuccessDataResult<List<WayOfWorking>>(wayOfWorkingDao.findAll(),"Çalışma Türleri Listelendi");
    }

   
    public DataResult<WayOfWorking> getById(int id) {
        return new SuccessDataResult<WayOfWorking>(wayOfWorkingDao.getOne(id),"Getirildi");
    }

   
    public DataResult<WayOfWorking> add(WayOfWorking wayOfWorking) {
        this.wayOfWorkingDao.save(wayOfWorking);
        return new SuccessDataResult<WayOfWorking>("Ekleme Başarılı");
    }


}