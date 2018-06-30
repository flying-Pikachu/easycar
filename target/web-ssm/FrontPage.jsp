<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/FrontPage.css"/>
</head>
<body>
<div class="content">
    <input type="hidden" value="${userName}" id="userName">
    <div class="title">
        Easy-Car易人租车管理系统
    </div>
    <div class="cars-description">
        <div class="choose-car">
            <table border="1">
                <tr>
                    <th>品牌</th>
                    <c:forEach items="${carBrands}" varStatus="i" var="carB">
                        <td>
                            <input type="Radio" name="car_type" id="${carB}"/> <label for="${carB}">${carB}</label>
                        </td>
                    </c:forEach>
                </tr>
                <tr>
                    <th>日租金</th>
                    <td>
                        <input type="text" name="lowPrice" value="" id="lowPrice">
                        ~
                        <input type="text" name="highPrice" value="" id="highPrice">
                    </td>
                </tr>
            </table>
            <button class="choose">选车</button>
        </div>
        <div class="cars-hire">
            <table border="0">
                <%--<tr>--%>
                <%--<th><input type="checkbox" name="sequence" id="sequence" checked="checked" />默认排序</th>--%>
                <%--<th>租金由低到高</th>--%>
                <%--<th><input type="checkbox" name="inventory" id="inventory" checked="checked" />只看库存</th>--%>
                <%--<th>全部车型不限里程</th>--%>
                <%--</tr>--%>
                <c:forEach items="${cars}" varStatus="i" var="car">
                    <tr>
                            <%--<td><img src="####"/></td>--%>
                        <td>
                            <form action="${pageContext.request.contextPath}/cars/carByCarID?carID=${car.carid}" method="post">
                                <input type="submit" value="租车">
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>
</body>
</html>
