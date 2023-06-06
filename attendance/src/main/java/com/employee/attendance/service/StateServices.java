package com.employee.attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.attendance.entity.State;
import com.employee.attendance.repository.StateRepo;

@Service
public class StateServices {

	@Autowired
	private StateRepo stateRepo;
	
	public void addState(State s) {
		stateRepo.save(s);
	}
	
	public List<State> getAllState() {
		return stateRepo.findAll();
	}
}
