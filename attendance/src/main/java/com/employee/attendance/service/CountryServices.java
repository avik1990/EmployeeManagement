package com.employee.attendance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.attendance.entity.Country;
import com.employee.attendance.repository.CountryRepo;

@Service
public class CountryServices {

	@Autowired
	private CountryRepo countryRepo;
	
	public void addCountry(Country cnt) {
		countryRepo.save(cnt);
	}
	
	public List<Country> getAllCountries() {
		return countryRepo.findAll();
	}
	
	/*
	 * public Optional<Country> getCoutryById(Long id) { return
	 * countryRepo.findById(id); }
	 */
	
	 public Country getCoutryById(Long id) {
	        return countryRepo.findById(id).orElse(null);
	    }
}
