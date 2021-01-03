package com.spring.app.data.exporter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.app.dto.Salary;


public class SalaryJsonConverter {

	public String convertToJson(Salary salary) throws JsonProcessingException {
		
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(salary);
	}
}
