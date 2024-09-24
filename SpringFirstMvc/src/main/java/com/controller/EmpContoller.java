package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.controller.connection.FactoryProvider;
import com.controller.dao.EmployeeDao;
import com.controller.model.Employee;

@Controller
public class EmpContoller {

	@Autowired
	Employee employee;
	@Autowired
	EmployeeDao dao;
	
	@RequestMapping("go")
	public  ModelAndView show(@ModelAttribute Employee employee)
	{
		/*
		 * String name = request.getParameter("name"); String email =
		 * request.getParameter("email"); String mobile =
		 * request.getParameter("mobile"); String password =
		 * request.getParameter("password");
		 */
		
		
		/*
		 * employee.setName(name); employee.setEmail(email); employee.setMobile(mobile);
		 * employee.setPassword(password);
		 */
		
		//System.out.println(name +" "+ email+" "+mobile+" "+password);
		
		ModelAndView andView=new ModelAndView("home");
		
		dao.saveEmployee(employee);
		
		
		
		andView.addObject("msg", "hello spring mvc...");
		return andView;
	
	
	
	}
	

}
