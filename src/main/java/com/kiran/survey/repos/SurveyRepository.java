package com.kiran.survey.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kiran.survey.model.Survey;

public interface SurveyRepository extends JpaRepository<Survey, Long>{

}
