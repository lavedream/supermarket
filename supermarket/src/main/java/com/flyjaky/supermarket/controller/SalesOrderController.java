package com.flyjaky.supermarket.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flyjaky.supermarket.service.InventoryService;
import com.flyjaky.supermarket.service.ProductService;


@Controller
public class SalesOrderController {
	
	@Resource
	private ProductService productService;
	
	@Resource
	private InventoryService inventoryService;
	
	
	
	
	@RequestMapping
	public void salesOrderNew(){
		
	}
	

}
