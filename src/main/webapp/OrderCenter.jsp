<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/OrderCenter.css"/>
</head>
<body>
<div class="content">
    <div class="title">Easy-Car易人租车管理系统</div>
    <div class="modify-cars">
        <div class="modify-car">
            <div class="ti">
                <div class="ti-l">订单中心</div>
            </div>
            <div class="cars-description">
                <form action="${pageContext.request.contextPath}/orders/allOrdersByOrderNum" method="post">
                    <input type="text" name="orderNum" placeholder="订单号">
                    <input type="submit" value="查询">
                    <table border="0">
                        <tr>
                            <th>订单号</th>
                            <th>车型</th>
                            <th>取车时间</th>
                            <th>还车时间</th>
                            <th>订单状态</th>
                            <th>费用总计</th>
                        </tr>
                        <c:forEach items="${allOrders}" varStatus="i" var="orders">
                            <tr>
                                <td>${orders.ordernum}</td>
                                <td>
                                </td>
                                <td>${orders.pickuptime}</td>
                                <td>${orders.returntime}</td>
                                <td>
                                    <c:if test="${orders.orderstatus == 0}">
                                        ${"订单提交"}
                                    </c:if>
                                    <c:if test="${orders.orderstatus == 1}">
                                        ${"订单取消"}
                                    </c:if>
                                    <c:if test="${orders.orderstatus == 2}">
                                        ${"交易成功"}
                                    </c:if>
                                </td>
                                <td>${orders.ordercost}</td>
                            </tr>
                        </c:forEach>
                    </table>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>