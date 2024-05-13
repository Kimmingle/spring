package com.spring4.test;


import javax.inject.Inject;

import com.spring4.dao.SampleDAO;
import com.spring4.dao.SampleDAOImpl;

public class TestInject {
	
	@Inject
	private SampleDAO sampleDAO;
	
	public TestInject() {
		this.sampleDAO= new SampleDAOImpl();
	}
}	
