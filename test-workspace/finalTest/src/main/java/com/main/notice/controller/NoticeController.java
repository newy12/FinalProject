package com.main.notice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.main.notice.model.service.NoticeService;

@Controller
public class NoticeController {
	@Autowired
	private NoticeService service;
}
