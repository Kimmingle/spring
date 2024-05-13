package com.spring1.util;

import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;  //이건 스프링 프레임워크 의 validation!!

//spring프레임워크에 validation을 활용한 Vo(dto) 검증

public class CheckValidator implements Validator {
	
	private static final Logger Log = LoggerFactory.getLogger(CheckValidator.class);
	
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Check.class.equals(clazz);
	}


	@Override
	public void validate(Object obj, Errors errors) {  //이 안에서 검증
		Log.info("springframework validation");
		
		Check check = (Check) obj;
		//id가 비어있다면 아이디를 입력해주세요 (notnull과 같음)
		
		
		//아이디 패턴 입력
		Pattern pat1 = Pattern.compile("^[a-z0-9]{5,12}$", Pattern.CASE_INSENSITIVE);  //compile:패턴을 만들어줌  CASE_INSENSITIVE:검증?
		
		//비번 패턴 입력
		Pattern pat2 = Pattern.compile("^[a-zA-Z0-9]{8,12}$", Pattern.CASE_INSENSITIVE);  //compile:패턴을 만들어줌  CASE_INSENSITIVE:검증?
		if(!(pat1.matcher(check.getId()).matches())){  //패턴이 맞는지
			errors.rejectValue("id", "check.id.invaild");   //invaild: 맞지않음
			
		}
		if(!(pat2.matcher(check.getPw()).matches())){  //패턴이 맞는지				//실제로 써먹는건 컨트롤..
			errors.rejectValue("pw", "check.pw.invaild");   //invaild: 맞지않음
			
		}
		
	}
	
}
	
