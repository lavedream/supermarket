package com.flyjaky.supermarket.dao;

import com.flyjaky.supermarket.entity.MenuRoleTab;

public interface MenuRoleTabDao {
    int deleteByPrimaryKey(Long mrid);

    int insert(MenuRoleTab record);

    int insertSelective(MenuRoleTab record);

    MenuRoleTab selectByPrimaryKey(Long mrid);

    int updateByPrimaryKeySelective(MenuRoleTab record);

    int updateByPrimaryKey(MenuRoleTab record);
}