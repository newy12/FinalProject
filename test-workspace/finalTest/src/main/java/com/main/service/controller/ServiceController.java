package com.main.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.main.service.model.service.ServiceService;

@Controller
public class ServiceController {
	@Autowired
	private ServiceService service;
}
