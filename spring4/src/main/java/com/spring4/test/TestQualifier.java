package com.spring4.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring4.dao.SampleDAO;
import com.spring4.dao.SampleDAOImpl;

public class TestQualifier {
	@Autowired
	@Qualifier("testDAO")
	private SampleDAO sampleDAO;
	
	public TestQualifier() {
		this.sampleDAO= new SampleDAOImpl();
	}
}
