package com.spring5.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring5.dto.Sample;
import com.spring5.service.SampleService;


@Controller
@RequestMapping("/test/")
public class TestController {
	@Autowired
	private SampleService sampleService;
	
	@RequestMapping(value="testList.do", method = RequestMethod.GET)
	public String getTestList(Model model) {
		List<Sample> list = sampleService.getSampleList();
		model.addAttribute("list", list);
		model.addAttribute("mapper", "테스트 목록1");
		return "test/testList";
	}
	
	@RequestMapping(value="testList2.do", method = RequestMethod.GET)
	public String getTestList2(Model model) {
		List<Sample> list = sampleService.getSampleList();
		model.addAttribute("list", list);
		model.addAttribute("mapper", "테스트 목록2");
		return "test/testList";
	}
	// 같은 페이지이지만 출력화면이 달라질 수 있음
	
	@GetMapping("insTest.do")
	public String insTest(Model model) {
		return "test/insTest";
	}
	
	@PostMapping("insTestPro.do")
	public String insTestPro(HttpServletRequest request, Model model) {
		int num=sampleService.maxNum() + 1;  //SampleService에 maxNum추가
		
		String title = request.getParameter("title");
		
		Sample sample = new Sample();
		sample.setNum(num);
		sample.setTitle(title);
		
		sampleService.insSample(sample);
		
		return "redirect:testList.do";
	}
	
	@GetMapping("getTest.do")
	public String getTestPro(HttpServletRequest request, Model model) {
		return "test/getTest";
	}
}
