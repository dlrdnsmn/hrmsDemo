package com.hrms.hrms.business.abstracts;

import java.util.List;

import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.entities.concretes.SystemPersonel;

public interface SystemPersonelService {

	DataResult<List<SystemPersonel>> getAll();
}
