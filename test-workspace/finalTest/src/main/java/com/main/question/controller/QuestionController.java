package com.main.question.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.main.question.model.service.QuestionService;

@Controller
public class QuestionController {
	@Autowired
	private QuestionService service;
}
