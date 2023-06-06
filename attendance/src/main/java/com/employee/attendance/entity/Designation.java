package com.employee.attendance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_designation")
public class Designation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long ID;
	String designation_name;
	String designation_code;
	
	
	public Designation(Long iD, String designation_name, String designation_code) {
		super();
		ID = iD;
		this.designation_name = designation_name;
		this.designation_code = designation_code;
	}
	
	public Designation() {
		super();
	}

	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getDesignation_name() {
		return designation_name;
	}
	public void setDesignation_name(String designation_name) {
		this.designation_name = designation_name;
	}
	public String getDesignation_code() {
		return designation_code;
	}
	public void setDesignation_code(String designation_code) {
		this.designation_code = designation_code;
	}
}