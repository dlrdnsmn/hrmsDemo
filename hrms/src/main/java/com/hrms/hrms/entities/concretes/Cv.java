package com.hrms.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="resume")
public class Cv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cv_id")
	private int cvId;
	
	@Column(name="image_url")
	private String imgUrl;
	
	@Column(name="github_url")
	private String githubUrl;
	
	@Column(name="linkedIn_url")
	private String linkedInUrl;
	
	@Column(name="about_me")
	private String about_me;
	
	@ManyToOne()
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	@OneToMany(mappedBy="cv")
	private List<Education> educations;
	
	@OneToMany(mappedBy="cv")
	private List<Tegnology> tegnologies;
	
	@OneToMany(mappedBy="cv")
	private List<Language> languages;
	
	@OneToMany(mappedBy="cv")
	private List<JobExperience> experiences;

}
