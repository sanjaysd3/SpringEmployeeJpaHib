package com.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emp.bean.Employee;
import com.emp.service.IEmpService;

@Controller
public class EmployeeController {
	
	@RequestMapping("home")
	public String getHome(Model m){
		m.addAttribute("empObj",new Employee());
		return "home";
	}
	
	@Autowired
	private IEmpService eserv;
	
	@RequestMapping(value="store",method=RequestMethod.POST)
	public String StoreEmployeeInfo(Model m,@ModelAttribute("empObj") Employee emp){
		
		String target=null;
		int eid=eserv.addEmployeeDetails(emp);
		if(eid>0){
			m.addAttribute("msg","Data Stored Successfully");
			m.addAttribute("eid", eid);
			target="success";
		}
		else{
			target="home";
		}
		return target;
		
	}

}
