package com.spring4.test;

import javax.annotation.Resource;

import com.spring4.dao.SampleDAO;
import com.spring4.dao.SampleDAOImpl;

public class TestResource {
	
	@Resource(name="testDAO")
	private SampleDAO sampleDAO;
	
	public TestResource() {
		this.sampleDAO= new SampleDAOImpl();
	}
}
