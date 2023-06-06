package com.employee.attendance.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.employee.attendance.entity.Country;
import com.employee.attendance.entity.Designation;
import com.employee.attendance.entity.EmployeeEntity;
import com.employee.attendance.entity.State;
import com.employee.attendance.service.CountryServices;
import com.employee.attendance.service.DesignationServices;
import com.employee.attendance.service.EmployeeService;
import com.employee.attendance.service.StateServices;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	@Autowired
	private DesignationServices desigService1;
	@Autowired
	private CountryServices countryService;
	@Autowired
	private StateServices stateService;
	
	@GetMapping("/allEmployees")
	@ResponseBody
	public List<EmployeeEntity> getCountry() {
		return empService.getAllEmployees();
	}

	@GetMapping("/")
	public String Login() {
		return "Login";
	}
	
	@GetMapping("/home")
	public String Home() {
		return "Home";
	}
		 
	
	@GetMapping("/leaveapply")
	public String LeaveApply() {
		return "LeaveApply";
	}
	

	@GetMapping("/frgotpassword")
	public String ForgotPassword() {
		return "ForgotPassword";
	}
	

	@PostMapping("/addemployee")
	public String addEmployee(@ModelAttribute EmployeeEntity emp) {
		empService.addEmployee(emp);
		return "redirect:/register";
	}
	
	@GetMapping("/register")
	public String  getRegisterFormData(Model model) {
		List<EmployeeEntity> emplistdata = empService.getAllEmployees();	
		List<Designation> desiglistdata = desigService1.getAllDesignation();	
		List<Country> counList = countryService.getAllCountries();	
		model.addAttribute("empList", emplistdata);
		model.addAttribute("desigList", desiglistdata);
		model.addAttribute("countryList", counList);
		return "Register";
	}
	
	@GetMapping("/employeeList")
	public String  getEmployeeList(Model model) {
		List<EmployeeEntity> emplistdata = empService.getAllEmployees();	
		model.addAttribute("empList", emplistdata);
		return "EmployeeList";
	}
	
	
	@GetMapping("/getallEmployee")
	@ResponseBody
	public List<EmployeeEntity> getAllEmployee() {
		return empService.getAllEmployees();
	}
	
	
	 //The op parameter is either Edit or Details
    @GetMapping("/Employee/{op}/{employeeId}")
    public String editCountry(@PathVariable Long employeeId, @PathVariable String op, Model model){
    	EmployeeEntity emp = empService.getEmployeeByID(employeeId);
    	List<Designation> desiglistdata = desigService1.getAllDesignation();	
		List<Country> counList = countryService.getAllCountries();	
		List<State> states = stateService.getAllState();	
		model.addAttribute("countryList", counList);
		model.addAttribute("desigList", desiglistdata);
		model.addAttribute("states", states);
        model.addAttribute("employee", emp);
        return "/Employee"+ op;
    }
}
