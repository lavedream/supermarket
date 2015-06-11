package com.flyjaky.supermarket.dao;

import java.util.List;

import com.flyjaky.supermarket.entity.Menu;

public interface MenuDao {
    int deleteByPrimaryKey(Long mid);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Long mid);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
    
    
    /**
     * @author liushuaic
     * @date 2015/06/11 23:13
     * @desc 查询出所有的菜单列表
     * **/
    List<Menu> getMenus();
}