package com.hrms.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cities")
public class Cities {
	
	@Id
	@Column(name ="id")
	private int id;
	
	@Column(name="city_name")
	private String cityName;
	
	@OneToMany
	private List<JobAdverts> jobAdverts;

}
