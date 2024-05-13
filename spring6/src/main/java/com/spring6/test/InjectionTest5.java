package com.spring6.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring6.dto.Warehouse;

public class InjectionTest5 {

	public static void main(String[] args) {
		ApplicationContext ctx5 = new GenericXmlApplicationContext("classpath:injectionContext5.xml");
		
		Warehouse ware2 = ctx5.getBean("ware2", Warehouse.class);
		System.out.println(ware2);
	}

}

