package com.spring5.service;

import java.util.List;

import com.spring5.dto.Sample;

public interface SampleService {
	public List<Sample> getSampleList();
	public Sample getSample(int num);
	public int maxNum();
	public void insSample(Sample sample);
	public void upSample(Sample sample);
	public void delSample(Sample sample);
	
}