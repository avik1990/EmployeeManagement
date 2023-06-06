package com.employee.attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.attendance.entity.Designation;
import com.employee.attendance.repository.DesignationRepo;

@Service
public class DesignationServices {
	
	@Autowired
	private DesignationRepo desigRepo;
	
	public void addDesignation(Designation emp) {
		desigRepo.save(emp);
	}
	
	public List<Designation> getAllDesignation() {
		return desigRepo.findAll();
	}
	
	public Designation getDesignationByID(Long id) {
		return desigRepo.findById(id).get();
	}
}
