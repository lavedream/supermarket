<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title>超市收银系统</title>
     <%@ include file="/common/head.jsp"%>
<%--      <jsp:include page="/common/head.jsp" /> --%>
</head>
<body>
    <div class="container_12" style="width:180px">
        <div class="grid_2" style="width:180px">
            <div class="box sidemenu"  style="width:180px">
                <div class="block" id="section-menu">
                    <ul class="section menu">
                        <li><a class="menuitem">基本信息管理</a>
                            <ul class="submenu">
                                <li><a href="/hello/hello.html"  target="right">商品信息管理</a> </li>
                                <li><a href="/orderSheet/orderSheetList.html" target="right">定货单管理</a> </li>
                                <li><a class="active" href="/inventory/inventoryList.html" target="right">库存管理</a> </li>
                                <li><a href="/salesOrder/salesOrderNew.html" target="right">商品销售</a> </li>
                                <li><a>Submenu 5</a> </li>
                            </ul>
                        </li>
                        <li><a class="menuitem">商品销售</a>
                            <ul class="submenu">
                                <li><a href="/salesOrder/salesOrderNew.html" target="right">商品销售</a> </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
