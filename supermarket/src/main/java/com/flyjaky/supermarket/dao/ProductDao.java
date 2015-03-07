package com.flyjaky.supermarket.dao;

import java.util.List;
import java.util.Map;

import com.flyjaky.supermarket.entity.Product;

public interface ProductDao {
    int deleteByPrimaryKey(Long pid);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Long pid);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
    
    
    public List<Map<String,Object>> getProductAllPage();
}