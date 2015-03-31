package com.flyjaky.supermarket.dao;

import java.util.List;

import com.flyjaky.supermarket.entity.OrderSheet;

public interface OrderSheetDao {
    int deleteByPrimaryKey(Long oid);

    int insert(OrderSheet record);

    int insertSelective(OrderSheet record);

    OrderSheet selectByPrimaryKey(Long oid);

    int updateByPrimaryKeySelective(OrderSheet record);

    int updateByPrimaryKey(OrderSheet record);
    
    List<OrderSheet> getOrderSheetAll(OrderSheet record);
    
}