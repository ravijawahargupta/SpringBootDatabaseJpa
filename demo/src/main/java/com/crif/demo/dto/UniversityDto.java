package com.crif.demo.dto;

import java.io.Serializable;
import java.util.List;

import com.crif.demo.entity.College;

public class UniversityDto implements Serializable{

	private int id;
	private String name;
	private List<College> college;

	public int getId() {
		return id;
	}

	public List<College> getCollege() {
		return college;
	}



	public void setCollege(List<College> college) {
		this.college = college;
	}



	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
