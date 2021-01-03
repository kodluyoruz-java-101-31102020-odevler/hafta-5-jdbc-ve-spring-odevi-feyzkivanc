package com.spring.app.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.app.model.daol.EmployeeDao;
import com.spring.app.model.services.EmployeeService;



public class EmployeeServiceImpl implements EmployeeService {


	@Autowired
	private EmployeeDao employeeDao;
	
	
	@Override
	public List<String> getAll() {
		
		return employeeDao.getNames();
	}
}

