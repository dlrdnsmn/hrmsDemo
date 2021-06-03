package com.hrms.hrms.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.hrms.entities.concretes.Cv;

public interface CvDao extends JpaRepository<Cv , Integer>{

	List<Cv> findByCandidate_Id(int candidateId);
	
}
