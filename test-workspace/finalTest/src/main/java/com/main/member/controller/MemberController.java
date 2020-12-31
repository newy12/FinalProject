package com.main.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.main.member.model.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService service;
}
