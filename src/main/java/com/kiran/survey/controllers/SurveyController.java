package com.kiran.survey.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiran.survey.service.SurveyService;

@RestController
public class SurveyController {

	@Autowired
	private SurveyService surveyService;

	@GetMapping("/getHelloWorld")
	public String getSurveys() {
		System.out.println("In SurveyController");
		return surveyService.getHelloWorld();
	}
}
