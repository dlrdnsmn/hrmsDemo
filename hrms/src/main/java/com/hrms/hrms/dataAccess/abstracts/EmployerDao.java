package com.hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hrms.hrms.entities.concretes.Employers;

public interface EmployerDao extends JpaRepository< Employers, Integer> {

}