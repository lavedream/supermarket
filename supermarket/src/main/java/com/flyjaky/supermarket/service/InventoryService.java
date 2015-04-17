package com.flyjaky.supermarket.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.flyjaky.supermarket.entity.Inventory;
import com.flyjaky.supermarket.manager.InventoryManager;


@Service
public class InventoryService {
	
	
	
	@Resource
	private InventoryManager inventoryManager;
	
	
	
	/**
	 * @author liushuaic
	 * 查询所有
	 * */
	public List<Inventory> queryAll(Inventory record){
		return inventoryManager.queryAll(record);
	}
	
	
	/**
	 * @author liushuaic
	 * 修改库存信息
	 * 
	 * **/
	public int updateInventory(Inventory record){
		return inventoryManager.updateInventory(record);
	}
	
	/**
	 * @author liushuaic
	 * 查询某一个库存信息
	 * */
	public Inventory getInventoryById(Long inid){
		return inventoryManager.selectByPrimaryKey(inid);
	}
	

}
