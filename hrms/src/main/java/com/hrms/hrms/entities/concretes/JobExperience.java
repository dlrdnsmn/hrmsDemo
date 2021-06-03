package com.hrms.hrms.entities.concretes;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="job_experiences")
public class JobExperience {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="experience_id")
	private int experienceId;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "work_position")
	private String workPosition;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "start_date")
	private Date startDate ;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "finish_date")
	@Nullable
	private Date finishDate ;
	
	@ManyToOne()
	@JoinColumn(name="cv_id")
	@JsonIgnore
	private Cv cv;

}