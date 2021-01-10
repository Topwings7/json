package com.tj.top.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.tj.top.dao.GundamDao;
import com.tj.top.vo.GundamVo;

@Service
public class IGundamService implements GundamService{
	@Autowired
	private GundamDao gundamDao;
	
	@Override
	public List<GundamVo> salesList() {
		return gundamDao.salesList();
	}

}
