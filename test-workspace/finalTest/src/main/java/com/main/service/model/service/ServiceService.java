package com.main.service.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.service.model.dao.ServiceDao;

@Service
public class ServiceService {
	@Autowired
	private ServiceDao dao;
	
}
