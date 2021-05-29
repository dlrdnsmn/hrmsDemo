package com.hrms.hrms.entities.concretes;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_adverts")
public class JobAdverts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="description")
	private String description;
	
	@Column(name="salary")
	private int salary;
	
	@Column(name="position_count")
	private int positionCount;
	
	@Column(name="opened_Date")
	private LocalDateTime openedDate=LocalDateTime.now();
	
	@Column(name="closed_Date")
	private LocalDate closedDate;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="max_Salary")
	private double maxSalary;
	
	@Column(name="min_salary")
	private double minSalary;
	
	@ManyToOne
	@JoinColumn(name="employer_id")
	private Employers employers;
	
	@ManyToOne
	@JoinColumn(name="job_position_id")
	private JobPosition jobPosition;
	
	@ManyToOne
	@JoinColumn(name="city_id")
	private Cities cities;
}
