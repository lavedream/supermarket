<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
 <link rel="shortcut icon" href="<%=path%>/img/common/address_128X128.ico"/>
 <link rel="Bookmark" href="<%=path%>/img/common/address_128X128.ico"/>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>超市收银系统</title>
</head>
	<frameset rows="120px,*" framespacing="0" border="0" frameborder="no">
		<frame scrolling="no" src="top.jsp"/> 
		<frameset cols="190px,*" frameborder="no"> 
			<frame name="left" src="tree.jsp"></frame>
			<frame name="right"></frame>
		</frameset>
	</frameset>
</html>
