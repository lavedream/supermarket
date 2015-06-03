package com.flyjaky.supermarket.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flyjaky.supermarket.entity.Product;
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
	
	
	@RequestMapping
	@ResponseBody
	public Product seachProduct( ModelMap res, String productCode){
		
		Product product=productService.getProductByProductCode(productCode);
		//res.put("product", product);
		return product;
		
	}
	
}
