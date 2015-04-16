 <%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<%@ include file="/common/head.jsp"%>
<title>商品列表页面</title>
</head>
<body>
	<div class="container_12">
		<div class="grid_10">
			<div class="box round first grid">
				<form action="/orderSheet/saveOrderSheet.html" method="post" id="seach">
					<h2>库存管理列表</h2>
					<div class="block">
						<table class="form">
							<tbody>
								<tr>
									<td class="col1"><label>商品名称</label></td>
									<td class="col2"><input type="text" id="grumble" /></td>
								</tr>
								<tr>
									<td colspan="2" align="center">
										<button class="btn btn-blue">查询</button>
									</td>
								</tr>
							</tbody>
						</table>
						<table class="form">
							<tbody>
								<tr>
<!-- 									<td align="left"> -->
<!-- 										<a href="/orderSheet/orderSheetNew.html" class="btn btn-blue">添加订单</a> -->
<!-- 									</td> -->
								</tr>
							</tbody>
						</table>
						<table class="data display datatable" id="example">
							<thead>
								<tr>
									<th>商品名称</th>
									<th>商品数量</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${datas}" var="data">
									<tr class="odd gradeA">
										<td><a href="/inventory/detail.html?id=${data.oid}">${data.order_name}</a></td>
										<td><a href="/inventory/toEditProduct.html?id=${data.oid }" class="btn btn-blue">修改商品数量</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
