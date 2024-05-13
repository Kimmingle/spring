package com.spring4.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring4.dao.SampleDAO;
import com.spring4.dao.SampleDAOImpl;

public class TestAutoWired {
	
	@Autowired
	private SampleDAO sampleDAO;
	
	public TestAutoWired() {
		this.sampleDAO= new SampleDAOImpl();
	}
}
