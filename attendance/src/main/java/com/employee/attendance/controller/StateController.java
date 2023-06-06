package com.employee.attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.employee.attendance.entity.Country;
import com.employee.attendance.entity.State;
import com.employee.attendance.service.CountryServices;
import com.employee.attendance.service.StateServices;

@Controller
public class StateController {

	@Autowired
	private StateServices stateservices;

	@Autowired
	private CountryServices countryServices;

	@GetMapping("/state")
	public String State(Model model) {
		List<Country> coutries = countryServices.getAllCountries();
		List<State> state = stateservices.getAllState();
		model.addAttribute("stateList", state);
		model.addAttribute("coutriesList", coutries);
		return "State";
	}

	@PostMapping("/addstate")
	public String addSate(@ModelAttribute State state) {
		stateservices.addState(state);
		return "redirect:/state";
	}
}
