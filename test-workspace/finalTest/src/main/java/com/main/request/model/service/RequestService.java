package com.main.request.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.request.model.dao.RequestDao;

@Service
public class RequestService {
	@Autowired
	private RequestDao dao;
	
}
