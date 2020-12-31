package com.main.favorite.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.favorite.model.dao.FavoriteDao;

@Service
public class FavoriteService {
	@Autowired
	private FavoriteDao dao;
}
