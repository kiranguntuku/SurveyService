package com.kiran.survey.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Survey {
	@Id
	private Long survey_id;
	private String survey_name;
	private String survey_createdby;
	private String survey_comments;

	public Survey() {

	}

	/**
	 * @param survey_id
	 * @param survey_name
	 * @param survey_createdby
	 * @param survey_comments
	 */
	public Survey(Long survey_id, String survey_name, String survey_createdby, String survey_comments) {
		super();
		this.survey_id = survey_id;
		this.survey_name = survey_name;
		this.survey_createdby = survey_createdby;
		this.survey_comments = survey_comments;
	}

	/**
	 * @return the survey_id
	 */
	public Long getSurvey_id() {
		return survey_id;
	}

	/**
	 * @param survey_id the survey_id to set
	 */
	public void setSurvey_id(Long survey_id) {
		this.survey_id = survey_id;
	}

	/**
	 * @return the survey_name
	 */
	public String getSurvey_name() {
		return survey_name;
	}

	/**
	 * @param survey_name the survey_name to set
	 */
	public void setSurvey_name(String survey_name) {
		this.survey_name = survey_name;
	}

	/**
	 * @return the survey_createdby
	 */
	public String getSurvey_createdby() {
		return survey_createdby;
	}

	/**
	 * @param survey_createdby the survey_createdby to set
	 */
	public void setSurvey_createdby(String survey_createdby) {
		this.survey_createdby = survey_createdby;
	}

	/**
	 * @return the survey_comments
	 */
	public String getSurvey_comments() {
		return survey_comments;
	}

	/**
	 * @param survey_comments the survey_comments to set
	 */
	public void setSurvey_comments(String survey_comments) {
		this.survey_comments = survey_comments;
	}

}
