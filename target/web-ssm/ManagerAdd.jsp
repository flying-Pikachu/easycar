<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/ManagerAdd.css"/>
</head>
<body>
<div class="content">
			<div class="title">
				Easy-Car易人租车管理系统
			</div>
			<div class="add-cars">
				<div class="add-car">
					<div class="ti">添加车辆</div>

					<div class="cars-description">
					<form action="${pageContext.request.contextPath}/cars/add" method="post">
						<table border="0">
						<tr>
							<td><label for="carBrand">品牌:</label><input type="text" name="carBrand" id="carBrand" placeholder="请输入品牌" /></td>
							<td><input type="file" name="browse" id="browse" value="浏览" /></td>
						</tr>
						<tr>
							<td><label for="carModel">型号:</label><input type="text" name="carModel" id="carModel" placeholder="请输入型号" /></td>
						</tr>
						<tr>
							<td><label for="carStruct">结构:</label><input type="text" name="carStruct" id="carStruct" placeholder="请输入结构" /></td>
						</tr>
						<tr>
							<td><label for="carDisplacement">排量:</label><input type="text" name="carDisplacement" id="carDisplacement" placeholder="请输入排量" /></td>
						</tr>
						<tr>
							<td><label for="isManual">变速箱:</label>
								<select id="isManual" name="isManual">
									<option value="1">手动档</option>
									<option value="0">自动挡</option>
								</select>
							</td>
						</tr>
						<tr>
							<td><label for="maxMum">乘坐人数:</label><input type="text" name="maxMum" id="maxMum" placeholder="请输入乘坐人数" /></td>
						</tr>
						<tr>
							<td><label for="originalPrice">原价:</label><input type="text" name="originalPrice" id="originalPrice" placeholder="请输入原价" /></td>
						</tr>
						<tr>
							<td><label for="discount">折扣:</label><input type="text" name="discount" id="discount" placeholder="请输入折扣" /></td>
						</tr>
						<tr><td><input type="submit" value="提交" class="submit"/></td></tr>
						</table>
					</form>
					</div>
				</div>
			</div>
		</div>
		
</body>
</html>