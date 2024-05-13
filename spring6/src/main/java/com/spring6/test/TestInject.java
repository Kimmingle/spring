package com.spring6.test;


import javax.inject.Inject;

import com.spring6.dao.SampleDAO;
import com.spring6.dao.SampleDAOImpl;

public class TestInject {
	
	@Inject
	private SampleDAO sampleDAO;
	
	public TestInject() {
		this.sampleDAO= new SampleDAOImpl();
	}
}	
