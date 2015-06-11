package com.flyjaky.supermarket.dao;

import com.flyjaky.supermarket.entity.RoleUserTab;

public interface RoleUserTabMapper {
    int deleteByPrimaryKey(Long ruid);

    int insert(RoleUserTab record);

    int insertSelective(RoleUserTab record);

    RoleUserTab selectByPrimaryKey(Long ruid);

    int updateByPrimaryKeySelective(RoleUserTab record);

    int updateByPrimaryKey(RoleUserTab record);
}