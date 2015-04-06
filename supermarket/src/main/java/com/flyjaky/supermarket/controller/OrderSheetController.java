package com.flyjaky.supermarket.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flyjaky.supermarket.entity.OrderSheet;
import com.flyjaky.supermarket.service.OrderSheetService;

/**code 02*/
@Controller
public class OrderSheetController {

	@Resource
	private OrderSheetService orderSheetService;

	
	/**
	 * 
	 * code:01
	 * */
	@RequestMapping
	@ResponseBody
	public Map<String, Object> saveOrderSheet(OrderSheet orderSheet) {
		Map<String, Object> data = new HashMap<String, Object>();
		try {
			orderSheetService.insertSelective(orderSheet);
			data.put("messageStatus", "000000");
			data.put("message","添加成功！");
		} catch (Exception e) {
			e.printStackTrace();
			data.put("messageStatus", "020100");
			data.put("message", "添加失败！");
		}
		return data;
	}

	@RequestMapping
	public void orderSheetNew() {

	}

	@RequestMapping
	public void orderSheetList(ModelMap map, OrderSheet orderSheet) {
		List<OrderSheet> data = orderSheetService.getOrderSheetAll(orderSheet);
		map.put("data", data);
	}

}
