package com.app.trivia.service;

import com.app.trivia.model.Question;
import com.app.trivia.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getAllQuestions(){
        return questionRepository.findAll();
    }

    public List<Question> getQuestionByCategory(String category){
        return questionRepository.findByCategory(category);
    }

    public void addQuestion(Question question){
        questionRepository.save(question);
    }
    public String getMessage(){
        return "Hello Spring";
    }
}