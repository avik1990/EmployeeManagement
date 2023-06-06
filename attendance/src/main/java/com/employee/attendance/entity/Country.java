package com.employee.attendance.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "tbl_country")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Country {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	Long countryId;
	String country_name;
	String code;

	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_country_id",referencedColumnName = "countryId")
	private List<State> states;
	
	
	public List<State> getStates() {
		return states;
	}
	public void setStates(List<State> states) {
		this.states = states;
	}
	public Long getID() {
		return countryId;
	}
	public void setID(Long iD) {
		countryId = iD;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Country(Long iD, String country_name, String code) {
		super();
		countryId = iD;
		this.country_name = country_name;
		this.code = code;
	}
	public Country() {
		super();
	}
	public Long getCountryId() {
		return countryId;
	}
	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}
	
	
}
