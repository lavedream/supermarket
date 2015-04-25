<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<%@ include file="/common/head.jsp"%>
<script type="text/javascript" src="<%=path%>/js/views/invertory/inventoryEdit.js"></script>
<title>定单管理</title>
</head>
<body>
	<div class="container_12">
		<div class="grid_10">
			<div class="box round first grid">
				<h2>添加定单</h2>
				<div class="block">
					<form id="inventoryForm" method="post">
					
						<table class="data display datatable" id="example">
							<tbody>
								<tr>
									<td><label>产品编号</label></td>
									<td>
										<input type="text"/>
									</td>
									<td>
										<button class="btn btn-blue" type="button" onclick="">添加</button>
									</td>
								</tr>
							</tbody>
						</table>
						
						<table class="data display datatable" id="example">
							<thead>
								<tr>
									<th>商品编码</th>
									<th>商品名称</th>
									<th>商品价格</th>
									<th>数量</th>
									<th>总价</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>
										66778987
									</td>
									<td>
										方便面
									</td>
									<td>
										1.2
									</td>
									<td>
										<input type="text" value="1"></input>
									</td>
									<td>
										<input type="text"/>
									</td>
									<td>
										<button class="btn btn-blue" type="button" onclick="">添加</button>
									</td>
								</tr>
							</tbody>
						</table>
						
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
