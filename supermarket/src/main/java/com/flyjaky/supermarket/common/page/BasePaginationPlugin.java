package com.flyjaky.supermarket.common.page;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import java.util.Properties;

import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.executor.statement.BaseStatementHandler;
import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;

public abstract class BasePaginationPlugin implements Interceptor {
	private String sqlIdRegex;
	// sqlsession 中select 方法 会执行executor.query()
	// 其实是执行抽象方法BaseExcutor.doQuery();
	// 实现类中doQuery方法会预先执行prepareStatement方法
	// 该方法中会执行 StatementHandler的prepear方法得到 statement 然后为statement填充数据
	// 最后 由StatementHandler.query()得到最总结果
	// 拦截prepear方法 我们可以使用一个connection连接，其他属性 根据反射帮助类得到（要看源码，知道字段名）
	public Object intercept(Invocation inv) throws Throwable {
		// 查看org.apache.ibatis.executor.statement.RoutingStatementHandler源码
		// 该类起到路由功能 对不同的需求 分配不同的 hanler类,而这些类都继承BaseStatementHandler
		if ((inv.getTarget() instanceof RoutingStatementHandler)) {
			RoutingStatementHandler rsh = (RoutingStatementHandler) inv
					.getTarget();
			BaseStatementHandler bsh = (BaseStatementHandler) ReflectHelper
					.getValueByFieldName(rsh, "delegate");
			MappedStatement ms = (MappedStatement) ReflectHelper.getValueByFieldName(bsh, "mappedStatement");
			String pageSqlId = ms.getId();
			BoundSql boundSql = rsh.getBoundSql();
			Object parameterObject = boundSql.getParameterObject();
			// 如果参数是map 而且 map中有一个page对象 说明是分页
			if (parameterObject != null && parameterObject instanceof Map
					&& ((Map) parameterObject).containsKey("page") && pageSqlId.matches(sqlIdRegex)) {
				String sql = boundSql.getSql();
				Connection conn = (Connection) inv.getArgs()[0];
				PageParameter page = (PageParameter) ((Map) parameterObject).get("page");
				String countSql = getCountSql(sql);// 汇总语句
				PreparedStatement ps = conn.prepareStatement(countSql);// 获得statement
				// 获得 参数绑定对象
				ParameterHandler parameterHandler = bsh.getParameterHandler();
				// 填充参数
				parameterHandler.setParameters(ps);
				// 获得结果
				ResultSet rs = ps.executeQuery();
				Integer count = null;
				if (rs.next()) {
					count = rs.getInt(1);
				}
				rs.close();
				ps.close();
				if (count == null || count == 0) {
					page.setTotalCount(count);
					String pageSql = getPageSql(sql, page);
					ReflectHelper.setValueByFieldName(boundSql, "sql", pageSql);
				} else {
					page.setTotalCount(count);
					String pageSql = getPageSql(sql, page);
					ReflectHelper.setValueByFieldName(boundSql, "sql", pageSql);
				}
			}
		}
		return inv.proceed();
	}

	/**
	 * 将sql 包装为 查询总数的sql
	 * 
	 * @param sql
	 * @return
	 */
	public abstract String getCountSql(String sql);

	/**
	 * 根据sql 和 分页对象 得到分页sql
	 * 
	 * @param sql
	 * @param pageInfo
	 * @return
	 */
	public abstract String getPageSql(String sql, PageParameter pageInfo);

	public Object plugin(Object arg0) {
		return Plugin.wrap(arg0, this);
	}

	public void setProperties(Properties prop) {
		this.sqlIdRegex = prop.getProperty("sqlIdRegex");
	}
}
