package com.kiran.survey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiran.survey.dao.SurveyDAO;

@Service
public class SurveyServiceImpl implements SurveyService {

	@Autowired
	private SurveyDAO surveyDAO;

	public SurveyDAO getSurveyDAO() {
		return surveyDAO;
	}

	public void setSurveyDAO(SurveyDAO surveyDAO) {
		this.surveyDAO = surveyDAO;
	}
	public String getHelloWorld() {
		System.out.println("In SurveyServiceImpl");
		return surveyDAO.getHelloWorld();
	}
	
}
