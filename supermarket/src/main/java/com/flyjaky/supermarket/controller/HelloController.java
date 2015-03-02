package com.flyjaky.supermarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping
	public void hello(){
		System.out.println("hello");
	}
}
