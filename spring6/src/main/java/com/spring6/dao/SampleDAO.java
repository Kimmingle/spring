package com.spring6.dao;

import java.util.List;

import com.spring6.dto.Sample;

public interface SampleDAO {
	public List<Sample> getSampleList();
	public Sample getSample(int num);
	public int maxNum();
	public void insSample(Sample sample);
	public void upSample(Sample sample);
	public void delSample(Sample sample);
}