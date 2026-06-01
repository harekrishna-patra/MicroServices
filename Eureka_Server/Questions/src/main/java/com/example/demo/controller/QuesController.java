package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Questions;
import com.example.demo.service.QuestionService;

@RestController
public class QuesController {
	
	@Autowired
	QuestionService questionService;
	
	@PostMapping("/add")
	public ResponseEntity<Questions> addQuestion(@RequestBody Questions question) {
		Questions question2 =  questionService.addQuestion(question);
		return new ResponseEntity<>(question2,HttpStatus.CREATED);
	}
	
	@GetMapping("/question")
	public ResponseEntity<List<Questions>> allQuestion() {
		List<Questions> allquestion = questionService.allQuestions();
		return new ResponseEntity<>(allquestion, HttpStatus.OK);
	}
	
	@GetMapping("/question/{id}")
	public ResponseEntity<Questions> getById(@PathVariable("id") int id) {
		Questions q = questionService.getById(id);
		return new ResponseEntity<>(q, HttpStatus.OK);
	}
	
	@GetMapping("/question/quiz/{id}")
	public ResponseEntity<List<Questions>> getbyquiz(@PathVariable("id") int id)
	{
		List<Questions> allQ = questionService.getByQuiz(id);
		return new ResponseEntity<>(allQ,HttpStatus.OK);
	}

}
