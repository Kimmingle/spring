package com.spring5.vo;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;    //javax의 validation으로 유효성 검증하기
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


//javax.validation +롬복


@NoArgsConstructor  
@AllArgsConstructor  
//생성자만 쓸거니까
public class CheckVO {	
	
	@Id //기본키(중복x)(하나의 항목만 허용)
	@Size(min=4, max=12, message="아이디는 5~12글자로 작성해야합니다.")  //annotation은 세미콜론x
	@Pattern(regexp="^[a-z0-9]+$", message="영문 소문자와 숫자로만 입력해야합니다")
	String id;  
	
	//Data넣으면 얘네가 안먹힐 수 있어서 수동으로 넣어줌
	
	
	
	
	@NotNull //(필수작성)
	@Size(min=8, max=12, message="비밀번호는 8~12글자로 작성해야합니다.")  //annotation은 세미콜론x
	@Pattern(regexp="^[a-z0-9]+$", message="영문 소문자와 숫자로만 입력해야합니다")
	String pw;
	
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "CheckVO [id=" + id + ", pw=" + pw + "]";
	}
	
	
}
