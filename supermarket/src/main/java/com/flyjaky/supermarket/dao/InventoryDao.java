package com.flyjaky.supermarket.dao;

import java.util.List;

import com.flyjaky.supermarket.entity.Inventory;

public interface InventoryDao {
	
    int deleteByPrimaryKey(Long inid);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(Long inid);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);
    
    List<Inventory> queryAll(Inventory record);
    
    Inventory getInventoryAndProductNameById(Long inid);
    
}