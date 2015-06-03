
package com.flyjaky.supermarket.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flyjaky.supermarket.entity.Inventory;
import com.flyjaky.supermarket.service.InventoryService;




/**
 * 
 * @author liushuaic
 * @date 2015/04/17 16:16
 * 02
 * **/
@Controller
public class InventoryController {
	
	@Resource
	private InventoryService inventoryService;
	
	
	
	
	/**
	 * @author liushuaic
	 * 查询所有
	 * 01
	 * */
	@RequestMapping
	public void inventoryList(ModelMap modelMap,Inventory record){
		
		
		List<Inventory> datas=inventoryService.queryAll(record);
		modelMap.put("datas",datas);
		
		
		
	}
	
	@RequestMapping
	public void inventoryEdit(ModelMap modelMap,Long id){
		
		Inventory record=inventoryService.getInventoryAndProductNameById(id);
		
		modelMap.put("data", record);
		
		
		
	}
	
	
	
	
	/**
	 * 02
	 * */
	@RequestMapping
	@ResponseBody
	public Map<String,Object> inventoryEditSave(ModelMap modelMap,Inventory record){
	
		Map<String,Object> data=new HashMap<String, Object>();
		
		try{
			
			inventoryService.updateInventory(record);
			
			data.put("messageStatus", "000000");
			data.put("message","操作成功！");
			
		}catch(Exception e){
			
			e.printStackTrace();
			
			data.put("messageStatus", "020200");
			data.put("message","操作失败！");
			
		}
		
		return data;
		
	}
	


}
