package com.hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.hrms.entities.concretes.WorkingTime;

public interface WorkingTimeDao extends JpaRepository<WorkingTime, Integer>{

}
