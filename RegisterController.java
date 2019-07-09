package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.dao.RegisterDao;
import com.lti.dao.RegisterDaoImpl;
import com.lti.entity.Register;
import com.sun.xml.bind.CycleRecoverable.Context;

@Controller	//This is a type of Component
public class RegisterController {

	//DI
	@Autowired
	private RegisterDao registerDaoImpl;
	
	@RequestMapping(path = "/register.lti",method = RequestMethod.POST)
	public String register(Register register) {

		registerDaoImpl.addregisteredDetails(register);
		
		return "Success.jsp";
	}
}
