package com.flyjaky.supermarket.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.flyjaky.supermarket.manager.ProductManager;


@Repository
public class ProductService {
	
	
	@Resource
	private ProductManager productManager;
	

	public List<Map<String,Object>> getProductAll(){
		return productManager.getProductAll();
	}
	
	
}
