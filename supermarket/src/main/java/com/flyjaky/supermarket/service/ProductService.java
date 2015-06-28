package com.flyjaky.supermarket.service;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.flyjaky.supermarket.entity.Inventory;
import com.flyjaky.supermarket.entity.Product;
import com.flyjaky.supermarket.manager.InventoryManager;
import com.flyjaky.supermarket.manager.ProductManager;


@Repository
public class ProductService {
	
	
	@Resource
	private ProductManager productManager;
	
	@Resource
	private InventoryManager inventoryManager;
	

	public List<Map<String,Object>> getProductAllPage(Map<String,Object> data){
		return productManager.getProductAllPage(data);
	}
	
	
	public Product getProjectById(Long id){
		return productManager.getProductById(id);
	}
	
	public void insertSelective(Product product){
		
		productManager.insertSelective(product);
		
		Inventory record=new Inventory();
		record.setPid(product.getPid());
		record.setCreated_at(Calendar.getInstance().getTime());
		record.setUpdated_at(Calendar.getInstance().getTime());
		
		inventoryManager.insertSelective(record);
		
		
	}
	
	
	public void updateByPrimaryKeySelective(Product product){
		productManager.updateByPrimaryKeySelective(product);
	}
	
	
	/**
	 * @author liushuaic
	 * @date 2015/05/02 12:49
	 * @desc 根据产品编号查询，产品
	 * */
	public Product getProductByProductCode(String productCode){
		return productManager.getProductByProductCode(productCode);
	}
	
}
