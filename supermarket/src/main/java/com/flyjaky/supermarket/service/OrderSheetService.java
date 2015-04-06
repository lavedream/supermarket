package com.flyjaky.supermarket.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.flyjaky.supermarket.entity.OrderSheet;
import com.flyjaky.supermarket.manager.OrderSheetManager;


@Repository
public class OrderSheetService {
	
	@Resource
	private OrderSheetManager orderSheetManager;
	
	
	
	
	/**
	 * @author liushuaic
	 * @date 2015/03/25 17:37
	 * @desc 添加订单信息
	 * */
	public void insertSelective(OrderSheet record){
		orderSheetManager.insertSelective(record);
	}
	

	public List<OrderSheet>getOrderSheetAll(OrderSheet record){
		return orderSheetManager.getOrderSheetAll(record);
	}
	
}
