package com.app.trivia.controller;

import com.app.trivia.model.Question;
import com.app.trivia.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("/message")
    private String message(){
        return questionService.getMessage();
    }

    @GetMapping("/all")
    private List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    private List<Question> getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);
    }

    @PostMapping("/add")
    public void addQuestion(@RequestBody Question question){
        questionService.addQuestion(question);
    }
}
