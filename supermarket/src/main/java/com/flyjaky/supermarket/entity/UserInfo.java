package com.flyjaky.supermarket.entity;

import java.util.Date;


/**
 * 
 * @author liushuaic
 * @date 2015/06/15 22:27
 * 
 * */
public class UserInfo {

	private String userName;
	private String password;
	private String sessionToket;
	private Date loginDateTime;
	private String loginIp;
	private String roleName;
	private Long roleId;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSessionToket() {
		return sessionToket;
	}

	public void setSessionToket(String sessionToket) {
		this.sessionToket = sessionToket;
	}

	public Date getLoginDateTime() {
		return loginDateTime;
	}

	public void setLoginDateTime(Date loginDateTime) {
		this.loginDateTime = loginDateTime;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

}
