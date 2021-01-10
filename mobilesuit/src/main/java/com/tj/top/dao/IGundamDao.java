package com.tj.top.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tj.top.vo.GundamVo;
@Repository
public class IGundamDao implements GundamDao{
	@Autowired
	private SqlSession sessionTemplate;
	
	@Override
	public List<GundamVo> salesList() {
		return sessionTemplate.selectList("salesList");
	}

}
