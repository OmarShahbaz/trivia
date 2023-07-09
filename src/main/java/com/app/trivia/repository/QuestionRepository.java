package com.app.trivia.repository;

import com.app.trivia.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    public List<Question> findByCategory(String category);
}
