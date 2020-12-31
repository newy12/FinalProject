package com.main.notice.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.notice.model.dao.NoticeDao;

@Service
public class NoticeService {
	@Autowired
	private NoticeDao dao;
}
