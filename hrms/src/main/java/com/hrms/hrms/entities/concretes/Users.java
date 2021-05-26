package com.hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
public class Users {


	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id",nullable = false)
		private int id;
	    
		@Column(name = "email",unique = true,nullable = false)
		private String email;
		
		@Column(name = "password",nullable = false)
		private String password;
		
		@Column(name="repeat_of_password")
		private String repeatOfPassword;
		

}
