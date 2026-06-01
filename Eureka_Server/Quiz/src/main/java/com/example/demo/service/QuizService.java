package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Quiz;

public interface QuizService {
	
	public Quiz addQuiz(Quiz q);
	
	public List<Quiz> getall();
	
	public Quiz getById(int id);

}
