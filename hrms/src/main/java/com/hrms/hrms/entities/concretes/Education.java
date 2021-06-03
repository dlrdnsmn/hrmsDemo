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
@Table(name="educations")

public class Education {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="education_id")
	private int educationId;
	
	@Column(name="school_name")
	private String schoolName;
	
	@Column(name="section")
	private String section;
	
	@Temporal(TemporalType.DATE)
	@Column(name="school_start_date")
	private Date schoolStartDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="school_finish_date")
	@Nullable
	private Date schoolFinishDate;
	
	@ManyToOne()
	@JoinColumn(name="cv_id")
	@JsonIgnore
	private Cv cv;

}
