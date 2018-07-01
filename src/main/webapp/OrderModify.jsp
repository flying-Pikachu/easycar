<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/UserExchange.css"/>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
</head>
<body>
<div class="content">
    <div class="title">Easy-Car易人租车管理系统</div>
    <div class="modify-cars">
        <div class="modify-car">
            <div class="ti">
                <div class="ti-l">修改订单</div>
            </div>
            <div class="ti-detail">
                <div class="order-no">订单号: ${order.ordernum}|</div>
                <div class="order-name">租车人:${order.username}|</div>
                <div class="order-date">租期<fmt:formatDate value="${order.pickuptime}" pattern="yyyy-MM-dd" />~<fmt:formatDate value="${order.returntime}" pattern="yyyy-MM-dd" /></div>
            </div>
            <div class="ti">
                <div class="ti-l">车辆信息</div>
            </div>
            <div class="cars-description">
                <form action="${pageContext.request.contextPath}/orders/update" method="post">
                    <table border="0" id="hire" width="100%" height="100%">
                        <tr>
                            <td width="250px">
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
                            <td width="50%">
                                <table border="0" id="table6">
                                    <tr>
                                        <td>取车时间</td>
                                        <td><input type="date" name="pickUpTime" id="pickUpTime"/></td>
                                    </tr>
                                    <tr>
                                        <td>还车时间</td>
                                        <td><input type="date" name="returnTime" id="returnTime"/></td>
                                    </tr>
                                    <tr id="tr1">
                                        <td>车辆租赁费</td>
                                        <input type="hidden" name="orderNum" id="orderNum" value="${order.ordernum}">
                                        <input type="hidden" name="carID" id="carID" value="${car.carid}">
                                        <input type="hidden" name="userName" id="userName" value="${userName}">
                                        <input type="hidden" name="originalprice" id="originalprice" value="${car.originalprice}">
                                        <input type="hidden" name="discount" id="discount" value="${car.discount}">
                                        <input type="hidden" name="orderCost" id="orderCost" value="">
                                    </tr>
                                    <script type="text/javascript">
                                        $("#pickUpTime").change(function(){
                                            var pickUpTime = $("#pickUpTime").val();
                                            var returnTime = $("#returnTime").val();
                                            var originalprice = $("#originalprice").val();
                                            var discount = $("#discount").val();
                                            if (returnTime != '' && returnTime != undefined && returnTime != null) {
                                                var start = new Date(pickUpTime);
                                                var end = new Date(returnTime);
                                                var t_start = start.getTime();
                                                var t_end = end.getTime();
                                                var days = (t_end - t_start)/1000/60/60/24;
                                                $("#days").value = days;
                                                var newBody = $(
                                                    "<td>" +
                                                    parseFloat(originalprice) * parseFloat(discount) +
                                                    " * " +
                                                    days +
                                                    " = " +
                                                    parseFloat(originalprice) * parseFloat(discount) * days +
                                                    "</td>");
                                                $("#orderCost").val(parseFloat(originalprice) * parseFloat(discount) * days);
                                                $("#tr1").append(newBody);
                                            }
                                        });
                                        $("#returnTime").change(function(){
                                            var pickUpTime = $("#pickUpTime").val();
                                            var returnTime = $("#returnTime").val();
                                            var originalprice = $("#originalprice").val();
                                            var discount = $("#discount").val();
                                            if (pickUpTime != '' && pickUpTime != undefined && pickUpTime != null) {
                                                var start = new Date(pickUpTime);
                                                var end = new Date(returnTime);
                                                var t_start = start.getTime();
                                                var t_end = end.getTime();
                                                var days = (t_end - t_start)/1000/60/60/24;
                                                $("#days").value = days;
                                                var newBody = $(
                                                    "<td>" +
                                                    parseFloat(originalprice) * parseFloat(discount) +
                                                    " * " +
                                                    days +
                                                    " = " +
                                                    parseFloat(originalprice) * parseFloat(discount) * days +
                                                    "</td>");
                                                $("#orderCost").val(parseFloat(originalprice) * parseFloat(discount) * days);
                                                $("#tr1").append(newBody);
                                            }
                                        });
                                    </script>
                                    <tr>
                                        <td></td>
                                        <td align="center"><input type="submit" value="提交" class="submit"/></td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>


                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>