<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<%@ include file="/common/head.jsp"%>
<script type="text/javascript" src="<%=path%>/js/views/invertory/inventoryEdit.js"></script>
<title>库存数量编辑</title>
</head>
<body>
	<div class="container_12">
		<div class="grid_10">
			<div class="box round first grid">
				<h2>库存数量编辑</h2>
				<div class="block">
					<form id="inventoryForm" method="post">


						<table class="data display datatable" id="example">
							<tbody>
								<tr>
									<td><label>商品名称</label></td>
									<td>
										${data.productName }
									</td>
								</tr>
								<tr>
									<td><label>商品数量</label></td>
									<td>
										<input maxlength="15" name="numbers" type="text" class="mini" title="商品数量"	value="${data.numbers}" />
									</td>
								</tr>
								<tr>
									<td colspan="2">
										<button class="btn btn-blue" type="button"
											onclick="inventoryEdit.saveInventory()">保存</button>
									</td>
								</tr>
							</tbody>
						</table>

						<div style="display: none;">
							<!-- form hidden 隐藏域-->
							<input type="hidden" name="inid" value="${data.inid }" />
						</div>

					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
