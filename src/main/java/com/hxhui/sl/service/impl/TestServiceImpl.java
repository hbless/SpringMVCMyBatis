package com.hxhui.sl.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hxhui.sl.dao.TestDao;
import com.hxhui.sl.service.TestService;

@Service(value="testService")
public class TestServiceImpl implements TestService{

	@Resource
	public TestDao testDao;
	@Override
	public int doService(Map<String, Object>params) {
		// TODO Auto-generated method stub
		System.out.println("doService");
		return testDao.doDao(params);
	}

}
