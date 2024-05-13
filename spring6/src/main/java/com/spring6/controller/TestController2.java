package com.spring6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring6.dto.Sample;
import com.spring6.service.SampleService;


@Controller
@RequestMapping("/test2/")
public class TestController2 {
	@Autowired
	private SampleService sampleService;
		
		@GetMapping("get1.do")
		public String get1(@RequestParam("num") int num, @RequestParam("title")String title, Model model) {
			// Http 요청 파라미터의 이름(num, title)으로 바인딩하여 그 값을 변수에 저장한다.
			model.addAttribute("num", num);
			model.addAttribute("title", title);
			return "test2/get1";
		}
		
		// Sample객체로 받음
		@GetMapping("get2.do")
		public String get2(Sample sample, Model model) {
			model.addAttribute("test", sample);
			return "test2/get2";
		}
		
		//@ModelAttribute
		@GetMapping("get3.do")
		public String get3(@ModelAttribute("sam") Sample sample, Model model) {
			return "test2/get3";
		}
		
		// parhVariable은 url을 이용해서 값을 보내기 때문에 get에서만 쓸 수 있음 (리엑트가 이런방식) post에서 쓰려면 method="get"해주기
		@GetMapping("get4.do/{num}/{title}")
		public String get4(@PathVariable("num") int num, 
				@PathVariable("title") String title, Model model) {
			Sample test = new Sample(num, title, "2024-05-09");
			model.addAttribute("test", test);
			return "test2/get4";
		}
		
		//String이 아닌 ModelandView로 보냄 -addobject써야하는듯?(예전엔 이런방식)
		@GetMapping("get5.do")
		public ModelAndView get5(@RequestParam("num") int num, 
				@RequestParam("title") String title, ModelAndView mav) {
			mav.addObject("num", num);
			mav.addObject("title", title);
			mav.setViewName("test2/get5");
			return mav;
		}
		
		
		//post방식
				//get은 보통 요청주소에 의해 sql을 셀렉트 할때
				
		
		@GetMapping("post.do")  //이건왜 get?
		public String post(Model model) {
			return "test2/post";
		}
		
		
		@PostMapping("post1.do")
		public String post1(@RequestParam("num") int num, 
				@RequestParam("title") String title, Model model) {
			model.addAttribute("num", num);
			model.addAttribute("title", title);
			return "test2/post1";
		}

		@PostMapping("post2.do")
		public String post2(Sample sample, Model model) {
			model.addAttribute("test", sample);
			return "test2/post2";
		}

		@PostMapping("post3.do")
		public String post3(@ModelAttribute("sample") Sample sample, Model model) {
			model.addAttribute("test", sample);
			return "test2/post3";
		}
		
		@GetMapping("post4.do/{num}/{title}")
		public String post4(@PathVariable("num") int num, 
				@PathVariable("title") String title, Model model) {
			Sample test = new Sample(num, title, "2024-05-09");
			model.addAttribute("test", test);
			return "test2/post4";
		}
		
		@PostMapping("post5.do")
		public ModelAndView post5(@RequestParam("num") int num, 
				@RequestParam("title") String title, ModelAndView mav) {
			mav.addObject("num", num);
			mav.addObject("title", title);
			mav.setViewName("test2/post5");
			return mav;
		}
}
