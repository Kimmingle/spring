package com.spring5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/check")
public class CheckController {
	
	
	@GetMapping("/")
	public String check(Model model) {
		return "check/home";
	}
	
	@GetMapping("check1.do")
	public String check1(Model model) {
		return "";
	}
	
	@PostMapping("check1pro.do")
	public String check1pro(Model model) {
		return "";
	}
}
