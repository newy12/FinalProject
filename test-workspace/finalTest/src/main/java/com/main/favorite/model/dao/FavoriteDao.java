package com.main.favorite.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FavoriteDao {
	@Autowired
	private SqlSessionTemplate session;
	
}
