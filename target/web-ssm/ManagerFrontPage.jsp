<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/ManagerFrontPage.css"/>
<title>Insert title here</title>
</head>
<body>
<div class="content"> 
	<div class="title">Easy-Car 易人租车管理系统</div>
	<div class="reservation">
	<div class="operation">
	<table border="0">
		<tr>
			<td><button class="inputfield" onclick="window.location.href='${pageContext.request.contextPath}/orders/allOrders'">订单中心</button></td>
			<td><button class="inputfield" onclick="window.location.href='${pageContext.request.contextPath}/cars/allCars'">更新车辆信息</button></td>
		</tr>
	</table>
	</div>
	</div>
</div>
</body>
</html>