package com.flyjaky.supermarket.manager;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.flyjaky.supermarket.dao.OrderSheetDao;
import com.flyjaky.supermarket.entity.OrderSheet;



@Repository
public class OrderSheetManager {

	
	
	@Resource
	private OrderSheetDao orderSheetDao;
	
	public void deleteByPrimaryKey(Long oid){
		orderSheetDao.deleteByPrimaryKey(oid);
	}
	
	
	
	/**
	 * @author liushuaic
	 * @date   2015/03/27 17:16
	 * @desc   删除
	 * @param  OrderSheet 订单对象
	 * */
	public boolean insertSelective(OrderSheet record){
		if(orderSheetDao.insertSelective(record)>0){
			return true;
		}
		return false;
	}
	
	/**
	 * @author liushuaic
	 * @date   2015/03/27 17:39
	 * @desc 删除订单
	 * 
	 * */
	public  boolean updateByPrimaryKeySelective(OrderSheet record){
		if(orderSheetDao.updateByPrimaryKeySelective(record)>0){
			return true;
		}
		return false;
	}
	
	
	
}
