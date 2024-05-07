package com.spring3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring3.dto.Sample;
import com.spring3.service.SampleService;

@Controller
// Controller 객체는 비즈니스 로직을 처리하고, 그 결과를 바탕으로 뷰(ex. JSP)에 전달할 객체를 
//Model 객체에 저장한다. DispatcherServlet에게 view name을 리턴한다.

@RequestMapping("/sample/")
public class SampleController {
	
	@Autowired
	private SampleService sampleService;
	
	@GetMapping("list.do")
	public String getSampleList(Model model) {
		List<Sample> list = sampleService.getSampleList();
		model.addAttribute("list", list);
		return "sample/sampleList";
	}
}