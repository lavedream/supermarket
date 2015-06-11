package com.flyjaky.supermarket.dao;

import com.flyjaky.supermarket.entity.Role;

public interface RoleDao {
    int deleteByPrimaryKey(Long rid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long rid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}