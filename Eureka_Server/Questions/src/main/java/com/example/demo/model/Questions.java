package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "question_master")
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	String questionName;

	Integer quizId;
	
	Questions(){
		
	}

	public Questions(Integer id, String questionName, Integer quizId) {
		super();
		this.id = id;
		this.questionName = questionName;
		this.quizId = quizId;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public Integer getQuizId() {
		return quizId;
	}

	public void setQuizId(Integer quizId) {
		this.quizId = quizId;
	}

	
	
	

}
