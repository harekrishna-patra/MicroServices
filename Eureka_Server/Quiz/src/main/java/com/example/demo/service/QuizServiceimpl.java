package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Quiz;
import com.example.demo.repo.QuizRepo;

@Service
public class QuizServiceimpl implements QuizService {
	
	@Autowired
	QuizRepo repo;

	@Override
	public Quiz addQuiz(Quiz q) {
		// TODO Auto-generated method stub
		return repo.save(q);
	}

	@Override
	public List<Quiz> getall() {
		// TODO Auto-generated method stub
		List<Quiz> allQuiz = repo.findAll();
		
		return allQuiz;
	}

	@Override
	public Quiz getById(int id) {
		// TODO Auto-generated method stub
		Quiz q = repo.findById(id).orElseThrow();
		
		return q;
	}

}
