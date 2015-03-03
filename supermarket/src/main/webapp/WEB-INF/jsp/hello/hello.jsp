<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<%@ include file="/common/head.jsp"%>
</head>
<body>
	<div class="container_12">
		<div class="grid_10">
			<div class="box round first grid">
				<h2>商品列表</h2>
				<div class="block">
					<table class="data display datatable" id="example">
						<thead>
							<tr>
								<th>商品名称</th>
								<th>创建时间</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${data}" var="stu">
								<tr  class="odd gradeA"><td>${stu.product_name}</td><td>${stu.created_at }</td></tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
