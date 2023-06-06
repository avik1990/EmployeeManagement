package com.employee.attendance.entity;

import java.sql.Date;

import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_employee")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long employeeId;
	String fname;
	String lname;
	
	@Formula(value = " concat(fname, ' ', lname) ")
	private String fullName;
	
	String aadhar;
	String pan;
	String email;
	String password;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date date_of_joining;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date date_of_birth;
	String addressLine1;
	String addressLine2;
	String city;
	String zip;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date addedDate;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "designationId")
	private Designation designationInfo;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "countryId")
	private Country country;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "stateId")
	@JsonProperty(access = Access.WRITE_ONLY)
	private State state;

	public EmployeeEntity() {
		super();
	}

	public EmployeeEntity(Long employeeId, String fname, String lname, String fullName, String aadhar, String pan,
			String email, String password, Date date_of_joining, Date date_of_birth, String addressLine1,
			String addressLine2, String city, String zip, Date addedDate, Designation designationInfo, Country country,
			State state) {
		super();
		this.employeeId = employeeId;
		this.fname = fname;
		this.lname = lname;
		this.fullName = fullName;
		this.aadhar = aadhar;
		this.pan = pan;
		this.email = email;
		this.password = password;
		this.date_of_joining = date_of_joining;
		this.date_of_birth = date_of_birth;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.zip = zip;
		this.addedDate = addedDate;
		this.designationInfo = designationInfo;
		this.country = country;
		this.state = state;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDate_of_joining() {
		return date_of_joining;
	}

	public void setDate_of_joining(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public Designation getDesignationInfo() {
		return designationInfo;
	}

	public void setDesignationInfo(Designation designationInfo) {
		this.designationInfo = designationInfo;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	

	
}
