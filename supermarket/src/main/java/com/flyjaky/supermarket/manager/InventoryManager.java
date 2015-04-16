package com.flyjaky.supermarket.manager;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flyjaky.supermarket.dao.InventoryDao;
import com.flyjaky.supermarket.entity.Inventory;


@Repository
public class InventoryManager {
	
	
	@Autowired
	private InventoryDao inventoryDao;
	
	
	/**
	 * 
	 * @author liushuaic
	 * 数据添加
	 * 
	 * */
	public int insert(Inventory record){
		return inventoryDao.insert(record);
	}
	
	
	/**
	 * @author liushuaic
	 * 数据添加
	 * */
	public int insertSelective(Inventory record){
		return inventoryDao.insertSelective(record);
	}
	
	
	/**
	 * @author liushuaic
	 * 查询所有
	 * */
	public List<Inventory> queryAll(Inventory record){
		return inventoryDao.queryAll(record);
	}
	
	/**
	 * @author liushuaic
	 * 修改库存信息
	 * 
	 * **/
	public int updateInventory(Inventory record){
		record.setUpdated_at(Calendar.getInstance().getTime());
		return inventoryDao.updateByPrimaryKeySelective(record);
	}
	

}
