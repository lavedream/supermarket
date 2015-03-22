package com.flyjaky.supermarket.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flyjaky.supermarket.entity.Product;
import com.flyjaky.supermarket.service.ProductService;


/**
 * @author liushuaic
 * @date 2015/03/14 17:03
 * errorCode 分为6位
 * 000000
 * 前2位 controller 代码
 * 3，4位，方法 代码
 * 5，6位 ，错误代码
 * */
@Controller
public class HelloController {
	/**
	 * code :01
	 * */
	
	@Resource
	private ProductService productService; 

	
	/**
	 * code :01
	 * */
	@RequestMapping
	public void hello(ModelMap map){
		List<Map<String,Object>> data=productService.getProductAll();
		map.put("data",data);
	}
	
	/**
	 * code :02
	 * */
	@RequestMapping
	public void detail(ModelMap map,Long id){
		Product product=productService.getProjectById(id);
		 map.put("product", product);
	}

	/**
	 * code :03
	 * */
	@RequestMapping
	public void productNew(ModelMap map){
		
	}
	
	
	/**
	 * @author liushuaic
	 * @date 2015/03/13 18:06
	 * 添加产品
	 * code :04
	 * **/
	@RequestMapping
	@ResponseBody
	public Map<String,Object> saveProduct(ModelMap map,Product product){
		
		Map<String,Object> data=new HashMap<String, Object>();
		Date currentDate=Calendar.getInstance().getTime();
		
		product.setCreated_at(currentDate);
		product.setUpdated_at(currentDate);
		try{
			productService.insertSelective(product);
			data.put("messageStatus", "000000");
			data.put("message","产品添加成功！");
		}catch(Exception e){
			e.printStackTrace();  
			data.put("messageStatus", "010400");
			data.put("message","产品添加失败！"+"--"+e.getMessage());
		}  
		map.put("data", data); 
		return data;
	}
	
	@RequestMapping
	public void toEditProduct(ModelMap map,Long id){
		Product product=productService.getProjectById(id);
		map.put("product", product);
	}
	
	@RequestMapping
	@ResponseBody
	/**
	 * code :05
	 * */
	public Map<String,Object> editProduct(ModelMap map,Product product){
		Map<String,Object> data=new HashMap<String, Object>();
		Date currentDate=Calendar.getInstance().getTime();
		product.setUpdated_at(currentDate);
		try{
			productService.updateByPrimaryKeySelective(product);
			data.put("messageStatus", "000000");
			data.put("message","产品修改成功！");
		}catch(Exception e){
			e.printStackTrace();  
			data.put("messageStatus", "010500");
			data.put("message","产品修改失败！"+"--"+e.getMessage());
		}  
		map.put("data", data); 
		return data;
	}
	
}