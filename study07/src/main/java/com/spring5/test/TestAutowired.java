package com.spring5.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring5.dao.SampleDAO;
import com.spring5.dao.SampleDAOImpl;

public class TestAutowired {
	
	@Autowired
	private SampleDAO sampleDAO;
	
	public TestAutowired() {
		this.sampleDAO= new SampleDAOImpl();
	}
}
