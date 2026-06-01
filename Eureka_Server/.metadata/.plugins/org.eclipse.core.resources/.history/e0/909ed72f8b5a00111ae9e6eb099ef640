package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Questions;

@Repository
public interface QuestionRepo extends JpaRepository<Questions, Integer> {
	
	public List<Questions> findByQuizId(int qid);

}
