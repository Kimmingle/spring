package com.spring1.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring1.dto.Store;

public class InjectionTest1 {
// bean으로 만들어뒀기 때문에 getBean으로 불러올 수 있음
	
	public static void main(String[] args) {
		
		ApplicationContext ctx1 = new GenericXmlApplicationContext("classpath:injectionContext.xml");
		
		Store store1 = ctx1.getBean("store1", Store.class);
		System.out.println("store1"+store1.toString());
		
		Store store2 = ctx1.getBean("store2", Store.class);
		System.out.println("store2"+store2.toString());
		
		Store store3 = ctx1.getBean("store3", Store.class);
		System.out.println("store3"+store3.toString());
	}

}
