package com.spring.app.model.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.app.annotation.MethodRunningTime;
import com.spring.app.model.daol.DepartmentDao;

@Repository("departmentDaoImpl")

public class DepartmentDaoImpl implements DepartmentDao {
	@Override
	@MethodRunningTime( active = true )
	public List<String> getNames() {
		
		return Arrays.asList("İnsan Kaynakları", "Mühendislik", "Pazarlama");
		
	}

}
