package com.spring6.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring6.dao.SampleDAO;
import com.spring6.dao.SampleDAOImpl;

public class TestAutowired {
	
	@Autowired
	private SampleDAO sampleDAO;
	
	public TestAutowired() {
		this.sampleDAO= new SampleDAOImpl();
	}
}
