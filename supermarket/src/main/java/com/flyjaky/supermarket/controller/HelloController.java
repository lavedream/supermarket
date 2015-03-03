package com.flyjaky.supermarket.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flyjaky.supermarket.service.ProductService;

@Controller
public class HelloController {
	
	@Resource
	private ProductService productService; 

	@RequestMapping
	public void hello(ModelMap map){
		List<Map<String,Object>> data=productService.getProductAll();
		map.put("data",data);
		System.out.println(data.size());
		System.out.println("hello");
	}
}
