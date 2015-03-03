package com.flyjaky.supermarket.dao;

import java.util.List;
import java.util.Map;

/**
 * @author lavedream
 * @date 2015/03/02 16:47
 * @desc 商品操作类  project operation class
// * 
// * */
public interface ProductDao {
	
	
	/**
	 * @author lavedream
	 * @date 2015/03/02 16:47
	 * @desc 查询所有商品信息
	 * */
	public List<Map<String,Object>> getProductAllPage();
	
}
