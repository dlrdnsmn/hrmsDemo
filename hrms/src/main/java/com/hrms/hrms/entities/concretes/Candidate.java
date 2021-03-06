package com.hrms.hrms.entities.concretes;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@CrossOrigin
@AllArgsConstructor
@Table(name = "candidates")
@PrimaryKeyJoinColumn(name = "candidate_id", referencedColumnName = "id")
public class Candidate extends Users {

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "identification_number")
	private String identityNumber;

	@Column(name = "birth_date")
	private Date dateOfBirth;
}


