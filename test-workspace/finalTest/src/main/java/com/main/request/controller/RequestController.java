package com.main.request.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.main.request.model.service.RequestService;

@Controller
public class RequestController {
	@Autowired
	private RequestService service;
}
