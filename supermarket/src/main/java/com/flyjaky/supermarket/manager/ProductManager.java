package com.flyjaky.supermarket.manager;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.flyjaky.supermarket.dao.ProductDao;
import com.flyjaky.supermarket.entity.Product;


@Repository
public class ProductManager {

	@Resource
	private ProductDao productDao;
	
	public List<Map<String,Object>> getProductAllPage(Map<String,Object> data){
		return productDao.getProductAllPage(data);
	}
	
	public Product getProductById(Long id){
		return productDao.selectByPrimaryKey(id);
	}
	
	public void insertSelective(Product product){
		productDao.insertSelective(product);
	}
	
	public void updateByPrimaryKeySelective(Product product){
		productDao.updateByPrimaryKeySelective(product);
	}
	
	public Product getProductByProductCode(String productCode){
		return productDao.getProductByProductCode(productCode);
	}
	
	
}
