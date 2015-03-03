package com.flyjaky.supermarket.common.page;

import java.sql.Connection;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Signature;
@Intercepts(@Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class }))
public class MysqlPaginationPlugin extends BasePaginationPlugin {

	@Override
	public String getCountSql(String sql) {
		if(sql.indexOf("page_from")>0){
			return  "select count(1) from "+ sql.substring(sql.indexOf("page_from")+9,sql.indexOf("page_order")>0?sql.indexOf("page_order"):sql.length());
		}else if(sql.indexOf("page_order")>0){
			return  "select count(1) from ( "+ sql.substring(0,sql.indexOf("page_order")>0?sql.indexOf("page_order"):sql.length())+ ") as temp_ ";
		}else{
			return "SELECT COUNT(1) FROM (" + sql + ") as temp_";
		}
	}

	@Override
	public String getPageSql(String sql, PageParameter pageInfo) {
		Integer size = pageInfo.getPageSize();// 一页有多少
		sql = sql.replace("page_from", " from ");
		sql = sql.replace("page_order", " order ");
		return sql + " LIMIT " + (pageInfo.getCurrentPage()-1) * size + "," + size;
	}

}
