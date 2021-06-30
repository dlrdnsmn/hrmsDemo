package com.hrms.hrms.business.abstracts;

import java.util.List;

import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.entities.concretes.WorkingTime;

public interface WorkingTimeService {
    DataResult<List<WorkingTime>> getAll();
    DataResult<WorkingTime> getById(int id);
    DataResult<WorkingTime> add(WorkingTime workingTime);

}