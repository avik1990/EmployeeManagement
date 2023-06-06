package com.employee.attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.employee.attendance.entity.Designation;
import com.employee.attendance.entity.EmployeeEntity;
import com.employee.attendance.service.DesignationServices;

@Controller
public class DesignationController {
	
	@Autowired
	private DesignationServices desigService;

	@GetMapping("/designation")
	public String Designation() {
		return "Designation";
	}
	
	@PostMapping("/adddesignation")
	public String AddDesignation(@ModelAttribute Designation desig) {
		desigService.addDesignation(desig);
		return "redirect:/designation";
	}
	
	
	/*
	 * @GetMapping("/alldesignations") public ModelAndView getAllDesignation() {
	 * List<Designation> list = desigService.getAllDesignation(); return new
	 * ModelAndView("booklist","book",list); }
	 */
	
	

}
