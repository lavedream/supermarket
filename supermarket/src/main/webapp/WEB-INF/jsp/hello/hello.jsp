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
				<form action="/hello/hello.html" method="post" id="seach">
					<h2>商品列表</h2>
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
									<td align="left">
										<a href="/hello/productNew.html" class="btn btn-blue">添加商品</a>
									</td>
								</tr>
							</tbody>
						</table>
						<table class="data display datatable" id="example">
							<thead>
								<tr>
									<th>商品名称</th>
									<th>商品进价</th>
									<th>商品编码</th>
									<th>创建时间</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${data}" var="product">
									<tr class="odd gradeA">
										<td><a href="/hello/detail.html?id=${product.pid}">${product.product_name}</a></td>
										<td>${product.purchase_price}</td>
										<td>${product.project_code}</td>
										<td>${product.created_at }</td>
										<td><a href="/hello/toEditProduct.html?id=${product.pid }" class="btn btn-blue">修改商品</a></td>
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
