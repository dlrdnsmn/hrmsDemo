package com.hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.hrms.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {
	Candidate findByIdentityNumber(String identityNumber);
	Candidate findByEmail(String email);
}
