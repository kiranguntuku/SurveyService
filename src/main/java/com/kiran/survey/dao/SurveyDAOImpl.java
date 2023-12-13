package com.kiran.survey.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kiran.survey.repos.SurveyRepository;

@Repository
public class SurveyDAOImpl implements SurveyDAO{

	@Autowired
	SurveyRepository surveyRepository;
	
	
	public String getHelloWorld() {
		System.out.println("In SurveyDAOImpl");
		return "Hello World !!"+surveyRepository.findAll();
	}
}
