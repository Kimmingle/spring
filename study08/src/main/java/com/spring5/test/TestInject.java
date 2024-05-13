package com.spring5.test;


import javax.inject.Inject;

import com.spring5.dao.SampleDAO;
import com.spring5.dao.SampleDAOImpl;

public class TestInject {
	
	@Inject
	private SampleDAO sampleDAO;
	
	public TestInject() {
		this.sampleDAO= new SampleDAOImpl();
	}
}	
