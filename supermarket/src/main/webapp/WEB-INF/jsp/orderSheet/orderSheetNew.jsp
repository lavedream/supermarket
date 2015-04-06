<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<%@ include file="/common/head.jsp"%>
<script type="text/javascript" src="<%=path%>/js/views/orderSheet/orderSheet-new.js"></script>
<title>商品添加</title>
</head>
<body>
	<div class="container_12">
		<div class="grid_10">
			<div class="box round first grid">
				<h2>定货单信息</h2>
				<div class="block">
					<form id="orderSheetForm" 
						method="post">


						<table class="data display datatable" id="orderSheetForm">
							<tbody>
								<tr>
									<td><label>定货单名称</label></td>
									<td><input name="order_name" type="text" class="mini" /></td>
								</tr>

								<tr>
									<td colspan="2">
										<button class="btn btn-blue" type="button"
											onclick="orderSheetNew.saveOrderSheet()">保存</button>
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
