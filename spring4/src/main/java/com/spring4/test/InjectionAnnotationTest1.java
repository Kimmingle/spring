package com.spring4.test;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring4.dto.Market;
import com.spring4.dto.Shop;
import com.spring4.dto.Store;





@Service
public class InjectionAnnotationTest1 {

	@Autowired   //해당 타입의 객체를 찾아서 자동으로 할당.
	private InjectionAnnotation1 obj1;  //InjectionAnnotation1타입의 빈을 주입받는다. 
	
	@Autowired
	private InjectionAnnotation2 obj2;
	
	@Autowired
	private InjectionAnnotation3 obj3;
	
	@Autowired
	private InjectionAnnotation4 obj4;

	public Store getStore() { return obj1.getStoreBean1();	}
	
	public Shop getShop() {	return obj2.getShopBean1();	}
	
	public Market getMarket() {	return obj3.getMarketBean1();	}
	
	public int getData1() {	return obj4.getData1();	}
}
