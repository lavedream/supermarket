package com.flyjaky.supermarket.dao;

import com.flyjaky.supermarket.entity.ProductOrderSheet;

public interface ProductOrderSheetDao {
    int deleteByPrimaryKey(Long osid);

    int insert(ProductOrderSheet record);

    int insertSelective(ProductOrderSheet record);

    ProductOrderSheet selectByPrimaryKey(Long osid);

    int updateByPrimaryKeySelective(ProductOrderSheet record);

    int updateByPrimaryKey(ProductOrderSheet record);
}