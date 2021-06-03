package com.hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tegnologies")
public class Tegnology {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "profession_id")
	private int professionId;

	@Column(name = "programming")
	private String programming;

	@Column(name = "technology")
	private String technology;

	@ManyToOne()
	@JoinColumn(name = "cv_id")
	@JsonIgnore
	private Cv cv;

}