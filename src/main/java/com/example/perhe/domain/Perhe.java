package com.example.perhe.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Perhe {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String job;
	private String hobby;
	
	@JsonIgnore
	
	public Perhe() {
		super();
	}
	
	public Perhe(String name, String job, String hobby) {
		super();
		this.name = name;
		this.job = job;
		this.hobby = hobby;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}


	@Override
	public String toString() {
		return "Perhe [id=" + id + ", name=" + name + ", job=" + job + ", hobby=" + hobby + "]";
	}

	

}
