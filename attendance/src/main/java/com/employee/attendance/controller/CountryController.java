package com.employee.attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.employee.attendance.entity.Country;
import com.employee.attendance.service.CountryServices;

@Controller
public class CountryController { 

	@Autowired
	private CountryServices countryServices;

	@GetMapping("/country")
	public String Country() {
		return "Country";
	}

	@PostMapping("/addcountry")
	public String addCounry(@ModelAttribute Country cnt) {
		countryServices.addCountry(cnt);
		return "redirect:/country";
	}

	@GetMapping("/parameters/country/{id}")
	@ResponseBody
	public Country getCountry(@PathVariable Long id) {
		return countryServices.getCoutryById(id);
	}
	
	@GetMapping("/allcountries")
	@ResponseBody
	public List<Country> getCountry() {
		return countryServices.getAllCountries();
	}
}
