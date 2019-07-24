package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Employee;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	
	@RequestMapping("/reg")
	public String showPage(ModelMap map) {
		// form backing object
		Employee e=new Employee();
		map.addAttribute("employee", e);
		return"Register";
	}
	@RequestMapping( value="/save", method=RequestMethod.POST)
	public String saveData(@ModelAttribute Employee employee, ModelMap map) {
		map.addAttribute("emp", employee);
		return"Info";
	}
	
	@RequestMapping("/all")
	public String ShowData(ModelMap map) {
		map.addAttribute("msg", "Hello Ui devloper");
		List<Employee> emp=Arrays.asList(new Employee(10,"AVBA",3.2,"Hyd"),
				new Employee(10,"AVBA",3.2,"kolkata"),
				new Employee(10,"Avay",7.2,"hyd"),
				new Employee(10,"Aaana",8.2,"Hyd"));
		
		return"Data";
	}

}
