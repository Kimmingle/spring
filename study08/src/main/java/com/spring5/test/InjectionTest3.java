package com.spring5.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring5.dto.Market;


public class InjectionTest3 {
// bean으로 만들어뒀기 때문에 getBean으로 불러올 수 있음

	public static void main(String[] args) {
		
		ApplicationContext ctx1 = new GenericXmlApplicationContext("classpath:injectionContext3.xml");
		
		Market market1 = ctx1.getBean("Market1", Market.class);
		System.out.println(market1);
		
		
		
	}

}
