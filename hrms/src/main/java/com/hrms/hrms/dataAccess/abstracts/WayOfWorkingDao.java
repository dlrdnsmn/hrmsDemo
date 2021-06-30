package com.hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.hrms.entities.concretes.WayOfWorking;

public interface WayOfWorkingDao extends JpaRepository<WayOfWorking, Integer> {

}
