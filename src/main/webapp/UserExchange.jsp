<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
						<div class="ti-l">车辆信息</div>
					</div>
					<div class="cars-description">
					<form action="${pageContext.request.contextPath}/orders/add" method="post">
						<table border="0" id="table1">
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
								<td><input type="submit" value="提交" class="submit"/></td>
							</tr>
						</table>
					</form>
					</div>
				</div>
			</div>
    	</div>
 	</body>
</html>