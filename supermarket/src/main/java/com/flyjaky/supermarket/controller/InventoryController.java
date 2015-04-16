package com.flyjaky.supermarket.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flyjaky.supermarket.entity.Inventory;
import com.flyjaky.supermarket.service.InventoryService;



@Controller
public class InventoryController {
	
	@Resource
	private InventoryService inventoryService;
	
	
	
	
	/**
	 * @author liushuaic
	 * 查询所有
	 * */
	@RequestMapping
	public void inventoryList(ModelMap modelMap,Inventory record){
		
		
		List<Inventory> datas=inventoryService.queryAll(record);
		modelMap.put("datas",datas);
		
		
		
	}
	
	
	public void inventoryEdit(ModelMap modelMap,Inventory record){
		
		inventoryService.updateInventory(record);
		
		
	}
	

}
