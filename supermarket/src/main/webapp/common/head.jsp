<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
request.setAttribute("basePath",basePath);
%>

	<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" 		prefix="c"%>
	<%@ taglib  uri="http://java.sun.com/jsp/jstl/functions" 	prefix="fn"%>
	<%@ taglib  uri="http://java.sun.com/jsp/jstl/fmt" 			prefix="fmt" %>
	
	
	<%@ page isELIgnored ="false"%>
    <link rel="stylesheet" type="text/css" href="<%=path%>/css/reset.css" 	media="screen" />
    <link rel="stylesheet" type="text/css" href="<%=path%>/css/text.css" 	media="screen" />
    <link rel="stylesheet" type="text/css" href="<%=path%>/css/grid.css" 	media="screen" />
    <link rel="stylesheet" type="text/css" href="<%=path%>/css/layout.css" 	media="screen" />
    <link rel="stylesheet" type="text/css" href="<%=path%>/css/nav.css" 	media="screen" />
    <!--[if IE 6]><link rel="stylesheet" type="text/css" href="<%=path%>/css/ie6.css" media="screen" /><![endif]-->
    <!--[if IE 7]><link rel="stylesheet" type="text/css" href="<%=path%>/css/ie.css" media="screen" /><![endif]-->
    <link href="<%=path%>/css/table/demo_page.css" rel="stylesheet" type="text/css" />
    <!-- BEGIN: load jquery -->
    <script src="<%=path%>/js/jquery-1.6.4.min.js" 						type="text/javascript"></script>
    <script src="<%=path%>/js/jquery-ui/jquery.ui.core.min.js"			type="text/javascript" ></script>
    <script src="<%=path%>/js/jquery-ui/jquery.ui.widget.min.js" 		type="text/javascript"></script>
    <script src="<%=path%>/js/jquery-ui/jquery.ui.accordion.min.js" 	type="text/javascript"></script>
    <script src="<%=path%>/js/jquery-ui/jquery.effects.core.min.js" 	type="text/javascript"></script>
    <script src="<%=path%>/js/jquery-ui/jquery.effects.slide.min.js" 	type="text/javascript"></script>
    <script src="<%=path%>/js/jquery-ui/jquery.ui.mouse.min.js" 		type="text/javascript"></script>
    <script src="<%=path%>/js/jquery-ui/jquery.ui.sortable.min.js" 		type="text/javascript"></script>
    <script src="<%=path%>/js/table/jquery.dataTables.min.js" 			type="text/javascript"></script>
    <!-- END: load jquery -->
    <script src="<%=path%>/js/table/table.js"							type="text/javascript"></script>
    <script src="<%=path%>/js/setup.js" 								type="text/javascript"></script>
    
    <script type="text/javascript">
    	var basePath='<%=basePath %>';
    </script>