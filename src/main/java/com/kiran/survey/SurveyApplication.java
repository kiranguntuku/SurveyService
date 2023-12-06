package com.kiran.survey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SurveyApplication {

	public static void main(String[] args) {
		System.out.println("App Starting");
		SpringApplication.run(SurveyApplication.class, args);
		System.out.println("App Started");
	}

}
