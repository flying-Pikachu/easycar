<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Insert title here</title>
	<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
</head>
<body>
<table border="0" style="border-collapse: collapse" width="780">
	<tr>
		<td>
			<table width="780" style="border-collapse: collapse" border="0">
				<tr>
					<td>
						<center>更新车辆</center>
					</td>
				</tr>
				<tr>
					<td height="29">&nbsp;&nbsp;&nbsp;&nbsp;
						<form action="${pageContext.request.contextPath}/cars/allCarsByBrand" method="post" id="form1">
							品牌:<input type="text" id="carBrand" name="carBrand" placeholder="请输入车辆品牌" height="18">
							&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" id="sub" value="查询">
							&nbsp;&nbsp;&nbsp;&nbsp;<a href="/easycar/ManagerAdd.jsp">添加</a>
							<input type="hidden" id="hidden1" value="${isSucc}">
							<script type="text/javascript">
								var succ = document.getElementById("hidden1").value;
								if (succ == "false")
								    alert("更新失败");
								else if (succ == "true")
								    alert("更新成功");
							</script>
						</form>
					</td>
				</tr>
				<tr>
					<td>
						<table width="780" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td width="100%"><table width="100%" border="0"
														cellpadding="0" cellspacing="1" bgcolor="B1BCEC">
									<tr>
										<td bgcolor="#FFFFFF">
											<table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#999999">
												<tr>
													<td height="6" bgcolor="#D3E3F5"></td>
												</tr>
											</table>
											<table id="table1" width="100%" border="0" cellpadding="2" cellspacing="1" bgcolor="#CCCCCC">
												<tr bgcolor="EEF2FD">
													<td width="9%"><div align="center">#</div></td>
													<td width="9%"><div align="center">品牌</div></td>
													<td width="9%"><div align="center">型号</div></td>
													<td width="9%"><div align="center">结构</div></td>
													<td width="9%"><div align="center">排量</div></td>
													<td width="9%"><div align="center">变速箱</div></td>
													<td width="9%"><div align="center">乘坐人数</div></td>
													<td width="9%"><div align="center">原价</div></td>
													<td width="9%"><div align="center">折扣</div></td>
													<td width="20%"><div align="center">操作</div></td>
												</tr>
												<% int j = 1; %>
												<c:forEach items="${cars}" varStatus="i" var="cars">
													<tr>
														<td><%=j++%></td>
														<td>${cars.carbrand}</td>
														<td>${cars.carmodel}</td>
														<td>${cars.carstruct}</td>
														<td>${cars.cardisplacement}</td>
														<c:if test="${cars.ismanual == 1}">
															<td>${"手动挡"}</td>
														</c:if>
														<c:if test="${cars.ismanual == 0}">
															<td>${"自动挡"}</td>
														</c:if>
														<td>${cars.maxmum}</td>
														<td>${cars.originalprice}</td>
														<td>${cars.discount}</td>
														<td><a href="${pageContext.request.contextPath}/cars/delete?carID=${cars.carid}">删除</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/cars/updateGetCar?carID=${cars.carid}">更新</a></td>
													</tr>
												</c:forEach>
											</table>
										</td>
									</tr>
								</table>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>
</body>
</html>