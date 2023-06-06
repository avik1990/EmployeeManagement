package com.employee.attendance.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.attendance.entity.Designation;
import com.employee.attendance.entity.EmployeeEntity;
import com.employee.attendance.repository.DesignationRepo;
import com.employee.attendance.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;
	

	public void addEmployee(EmployeeEntity emp) {
		empRepository.save(emp);
	}

	public List<EmployeeEntity> getAllEmployees() {
		return empRepository.findAll();
	}

	public EmployeeEntity getEmployeeByID(Long id) {
		return empRepository.findById(id).get();
	}
	

}
