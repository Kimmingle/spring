package com.spring5.test;

import javax.annotation.Resource;

import com.spring5.dao.SampleDAO;
import com.spring5.dao.SampleDAOImpl;

public class TestResource {
	
	@Resource(name="testDAO")
	private SampleDAO sampleDAO;
	
	public TestResource() {
		this.sampleDAO= new SampleDAOImpl();
	}
}
