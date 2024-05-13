package com.spring6.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring6.dto.Store;


@RestController
@RequestMapping("/api/")
public class RestfulController {
	
 //기본적으로 json으로 제공한다.
	@GetMapping("api1.do")
	public int getApi1() {
		
		return 1004;
	}
	
	@GetMapping("api2.do")
	public Store getApi2() {
		Store store = new Store(1, "EmArt");
		return store;
	}
	
	@GetMapping("api2.do")
	public List<Store> getApi3() {
		Store store1 = new Store(1, "EmArt");
		Store store2 = new Store(2, "HomePlus");
		Store store3 = new Store(3, "Costco");
		ArrayList<Store> StoreList = new ArrayList<>();
		StoreList.add(store1);
		StoreList.add(store2);
		StoreList.add(store3);
		return StoreList;
	}
}
