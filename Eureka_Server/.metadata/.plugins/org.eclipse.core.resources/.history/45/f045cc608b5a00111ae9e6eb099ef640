package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Questions;
import com.example.demo.repo.QuestionRepo;
import com.example.demo.service.QuestionService;


@Service
public class QuestionServiceimpl implements QuestionService {
	
	@Autowired
	QuestionRepo repo;

	@Override
	public Questions addQuestion(Questions q) {
		// TODO Auto-generated method stub
		return repo.save(q);
	}

	@Override
	public List<Questions> allQuestions() {
		// TODO Auto-generated method stub
		
		List<Questions> allQues = repo.findAll();
		
		return allQues;
	}

	@Override
	public Questions getById(int id) {
		// TODO Auto-generated method stub
		Questions qs = repo.findById(id).orElseThrow();
		return qs;
	}

	@Override
	public List<Questions> getByQuiz(int qid) {
		// TODO Auto-generated method stub
		
		List<Questions> qsById = repo.findByQuizId(qid);
		
		return qsById;
	}

}
