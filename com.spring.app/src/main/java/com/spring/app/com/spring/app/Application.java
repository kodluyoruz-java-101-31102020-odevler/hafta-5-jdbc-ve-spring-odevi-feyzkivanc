package com.spring.app.com.spring.app;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.spring.app.configuration.AppConfig;

@SpringBootApplication(scanBasePackages= {"com.spring.app.configuration"})
@ImportResource("applicationContext.xml")
@Import(AppConfig.class)

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
