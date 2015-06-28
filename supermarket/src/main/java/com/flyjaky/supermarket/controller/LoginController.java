package com.flyjaky.supermarket.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flyjaky.supermarket.entity.UserInfo;



/**
 * @author liushuaic
 * @date 2015/06/15 22:19
 * 登陆校验
 * */
@Controller
public class LoginController {

	@RequestMapping
	public String login(String userName,String password,HttpServletRequest request){
		
		if(null != userName && null != password){
			if(userName.equals("helloWorld") &&  password.equals("liushuaic")){
				UserInfo userInfo=new UserInfo();
				userInfo.setLoginDateTime(Calendar.getInstance().getTime());
				userInfo.setUserName("liushuai");
				userInfo.setSessionToket("sessionToket");
				request.getSession().setAttribute("sessionToket", "sessionToket");
				userInfo.setRoleName("管理员");

				return "/index";
				
			}
		}
		return "/login";
	}
}
