package com.flyjaky.supermarket.dao;

import com.flyjaky.supermarket.entity.Menu;

public interface MenuMapper {
    int deleteByPrimaryKey(Long mid);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Long mid);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}