package com.hrms.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.WorkingTimeService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.dataAccess.abstracts.WorkingTimeDao;
import com.hrms.hrms.entities.concretes.WorkingTime;

import java.util.List;

@Service
public class WorkingTimeManager implements WorkingTimeService {
    private WorkingTimeDao workingTimeDao;

    @Autowired
    public WorkingTimeManager(WorkingTimeDao workingTimeDao) {
        this.workingTimeDao = workingTimeDao;
    }

    
    public DataResult<List<WorkingTime>> getAll() {
        return new SuccessDataResult<List<WorkingTime>>(workingTimeDao.findAll(),"Çalışma Zamanları Listelendi");
    }

   
    public DataResult<WorkingTime> getById(int id) {
        return new SuccessDataResult<WorkingTime>(workingTimeDao.getOne(id));
    }

    
    public DataResult<WorkingTime> add(WorkingTime workingTime) {
        return new SuccessDataResult<WorkingTime>(workingTimeDao.save(workingTime),"Ekleme Başarılı");
    }
}
