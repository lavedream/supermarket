package com.flyjaky.supermarket.manager;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.flyjaky.supermarket.dao.ProductDao;


@Repository
public class ProductManager {

	@Resource
	private ProductDao productDao;
	
	public List<Map<String,Object>> getProductAll(){
		return productDao.getProductAllPage();
	}
}
