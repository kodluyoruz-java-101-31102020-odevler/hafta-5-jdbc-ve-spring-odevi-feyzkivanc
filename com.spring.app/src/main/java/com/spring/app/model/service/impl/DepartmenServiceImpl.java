package com.spring.app.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.app.model.daol.DepartmentDao;
import com.spring.app.model.services.DepartmentService;

public class DepartmenServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;
	
	
	@Override
	public List<String> getAll() {
		
		List<String> names = departmentDao.getNames();
		return names;
	}

}
