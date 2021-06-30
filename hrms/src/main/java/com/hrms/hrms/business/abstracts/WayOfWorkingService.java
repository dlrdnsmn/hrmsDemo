package com.hrms.hrms.business.abstracts;

import java.util.List;

import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.entities.concretes.WayOfWorking;

public interface WayOfWorkingService {
    DataResult<List<WayOfWorking>> getAll();
    DataResult<WayOfWorking> getById(int id);
    DataResult<WayOfWorking> add(WayOfWorking wayOfWorking);
}