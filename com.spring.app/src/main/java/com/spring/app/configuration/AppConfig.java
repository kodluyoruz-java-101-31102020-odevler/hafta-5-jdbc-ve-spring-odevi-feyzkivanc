package com.spring.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.app.com.spring.app.ConsoleApplication;
import com.spring.app.data.exporter.SalaryJsonConverter;



@Configuration
@ComponentScan
public class AppConfig {
	@Bean("sJsonConverter")
	public SalaryJsonConverter createSalaryJsonConverter() {
		
		return new SalaryJsonConverter();
	}
	
	@Bean("consoleApplication")
	public ConsoleApplication createConsoleApplication() {
		
		return new ConsoleApplication();
	}
}
