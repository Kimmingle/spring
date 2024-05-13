package com.spring1.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//롬복을 활용한 dto


@Data 	//getter, setter, toString
@NoArgsConstructor  //매개변수 없다 
@AllArgsConstructor 	//모든 필드를 가지는 생성자

public class Check {
	private String id;
	private String pw;
	
	
}
