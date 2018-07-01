<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/UserOrder.css"/>
</head>
<body>
<div class="content">
    <div class="title">Easy-Car易人租车管理系统</div>
    <div class="modify-cars">
        <div class="modify-car">
            <div class="ti">
                <div class="ti-l">订单取消</div>
                <div class="ti-r">应付总价:${order.ordercost}</div>
            </div>
            <div class="ti-detail">
                <div class="order-no">订单号: ${order.ordernum}|</div>
                <div class="order-name">租车人:${order.username}|</div>
                <div class="order-date">租期<fmt:formatDate value="${order.pickuptime}" pattern="yyyy-MM-dd" />~<fmt:formatDate value="${order.returntime}" pattern="yyyy-MM-dd" /></div>
            </div>
            <div class="tiCar">
                <div class="ti-l">车辆信息</div>
                <div class="cars-description">
                    <table border="0" id="hire" width="400px" height="200px">
                        <tr>
                            <td width="200px">
                                <table border="0" id="carInformation">
                                    <tr >
                                        <td colspan="3">
                                            <img src="${pageContext.request.contextPath}/images/${car.img}" align="center"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td width="20%">${car.carbrand}</td>
                                        <td width="40%">
                                            ${car.carmodel}廂/${car.cardisplacement}/
                                            <c:if test="${car.ismanual == 1}">
                                                ${"手动挡"}
                                            </c:if>
                                            <c:if test="${car.ismanual == 0}">
                                                ${"自动挡"}
                                            </c:if>
                                        </td>
                                        <td width="30%">
                                            乘坐${car.maxmum}人
                                        </td>
                                    </tr>
                                </table>
                            </td>
                            <td width="200px">
                                <table border="0" id="table6">
                                    <tr>
                                        <td>取车时间</td>
                                        <td>
                                            <input type="text" name="pickUpTime" id="pickUpTime" value="<fmt:formatDate value="${order.pickuptime}" pattern="yyyy-MM-dd" />"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>还车时间</td>
                                        <td>
                                            <input type="text" name="returnTime" id="returnTime" value="<fmt:formatDate value="${order.returntime}" pattern="yyyy-MM-dd" />"/>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
            <div class="options">
                <table border="0">
                    <tr>
                        <td align="center">
                            <form action="${pageContext.request.contextPath}/orders/allOrdersByUserName?userName=${userName}&pn=1" method="post" name="myformcenter">
                                <input type="submit" value="订单中心" class="submit">
                            </form>
                        </td>
                        <td align="center">
                            <form action="" method="post" name="myformmodify">
                                <input type="submit" value="修改订单" class="submit" disabled/>
                            </form>
                        </td>
                        <td align="center">
                            <form action="" method="post" name="myformcancel">
                                <input type="submit" value="取消订单" class="submit" disabled/>
                            </form>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>
