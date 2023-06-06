package com.employee.attendance.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "tbl_state")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class State {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long stateId;
	String state_name;
	
	 @ManyToOne
	 @JoinColumn(name = "fk_country_id")
	 private Country country;
	

	public State() {
		super();
	}

	public State(Long iD, String state_name, Country country, Long countryid) {
		super();
		stateId = iD;
		this.state_name = state_name;
		this.country = country;
	}

	public Long getID() {
		return stateId;
	}

	public void setID(Long iD) {
		stateId = iD;
	}

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}


	
	//  public Long getCountryid() { return countryid; }
	  
	//  public void setCountryid(Long countryid) { this.countryid = countryid; }
	
}
