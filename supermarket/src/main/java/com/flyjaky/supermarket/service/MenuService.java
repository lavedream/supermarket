package com.flyjaky.supermarket.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.flyjaky.supermarket.dao.MenuDao;
import com.flyjaky.supermarket.entity.Menu;


@Service
public class MenuService {
	
	@Resource
	private MenuDao menuDao;
	

	 /**
     * @author liushuaic
     * @date 2015/06/11 23:13
     * @desc 查询出所有的菜单列表
     * **/
	public List<Menu> getMenus(){
		return menuDao.getMenus();
	}
	
}
