<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/ManagerModify.css"/>
    </head>
    <body>
    	<div class="content">
			<div class="title">
				Easy-Car易人租车管理系统
			</div>
			<div class="modify-cars">
				<div class="modify-car">
					<div class="ti">更改车辆</div>

					<div class="cars-description">
					<form action="${pageContext.request.contextPath}/cars/update?carID=${car.carid}" method="post">
						<table border="0">
						<tr>
							<td><label for="carBrand1">品牌:</label><input type="hidden" name="carBrand" id="carBrand" value="${car.carbrand}"><input type="text" name="carBrand1" id="carBrand1" disabled="disabled" value="${car.carbrand}" /></td>
						</tr>
						<tr>
							<td><label for="carModel">型号:</label><input type="text" name="carModel" id="carModel" value="${car.carmodel}"/></td>
						</tr>
						<tr>
							<td><label for="carStruct">结构:</label><input type="text" name="carStruct" id="carStruct" value="${car.carstruct}" /></td>
						</tr>
						<tr>
							<td><label for="carDisplacement">排量:</label><input type="text" name="carDisplacement" id="carDisplacement" value="${car.cardisplacement}" /></td>
						</tr>
						<tr>
							<td><label for="isManual">变速箱:</label>
								<select id="isManual" name="isManual">
									<c:if test="${car.ismanual == 1}">
										<option value="1"selected>手动档</option>
										<option value="0">自动挡</option>
									</c:if>
									<c:if test="${car.ismanual == 0}">
										<option value="1">手动档</option>
										<option value="0" selected>自动挡</option>
									</c:if>
								</select>
							</td>
						</tr>
						<tr>
							<td><label for="maxMum">乘坐人数:</label><input type="text" name="maxMum" id="maxMum" value="${car.maxmum}" /></td>
						</tr>
						<tr>
							<td><label for="originalPrice">原价:</label><input type="text" name="originalPrice" id="originalPrice" value="${car.originalprice}" /></td>
						</tr>
						<tr>
							<td><label for="discount">折扣:</label><input type="text" name="discount" id="discount" value="${car.discount}" /></td>
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