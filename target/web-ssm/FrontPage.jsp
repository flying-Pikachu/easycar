<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div id="bg">

    <nav class="navbar navbar-default">
        <div id="tip"> 欢迎光临易人租车，请<a href="">登录</a>或<a href="">注册</a></div>
        <div id="order">
            <a href="">我的订单</a>
            <a href="">帮助中心</a>
            0411-88888888
        </div>
    </nav>
    <div id="title"><h1 align="center">Easy-Car易人租车系统</h1></div>
    <table id="select" class="table table-bordered">
        <tr>
            <td>品牌</td>
            <c:forEach items="${carBrands}" varStatus="i" var="carB">
                <td>
                    <input type="Radio" name="car_type" id="${carB}"/> <label for="${carB}">${carB}</label>
                </td>
            </c:forEach>
        </tr>
        <tr>
            <td>日租金</td>
            <td colspan="2" align="center"><input type="text" name="lowPrice" id="lowPrice" value="" size="3"/>~&nbsp;<input type="text" name="highPrice" id="highPrice" value="" size="3"/></td>
        </tr>
    </table>
    <table class="table table-striped" border="0">
        <c:forEach items="${page.list}" var="car" varStatus="i">
            <tr>
                <%--<td width="100px">--%>
                    <%--<img src="${pageContext.request.contextPath }/static/img/${car.carPicture}"/>--%>
                <%--</td>--%>
                <td>
                        ${car.carbrand}
                    <br />
                    <br />
                        ${car.carmodel}/${car.cardisplacement}
                                <c:if test="${car.ismanual == 1}">
                                    ${"手动挡"}
                                </c:if>
                                <c:if test="${car.ismanual == 1}">
                                    ${"自动挡"}
                                </c:if>
                            <br /><br />乘坐${car.maxmum}人</td>
                <td><br />${car.originalprice * car.discount / 10}/日均<br /><br />原价：${car.originalprice}</td>
                <td align="center" valign="center"><br /><br />
                    <form action="${pageContext.request.contextPath}/cars/carByCarID?carID=${car.carid}&userName=${userName}" method="post">
                        <input type="submit" value="租车">
                    </form></td>
            </tr>
        </c:forEach>
    </table>
    <div class="row">
        <div class="col-md-6">
            当前${page.pageNum}页,总${page.pages}页,总共多少条${page.total}记录
        </div>
        <div class="col-md-6">
            <input type="hidden" id="carBrand" name="carBrand" value="">
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <li><a href="${pageContext.request.contextPath }/cars/carsWithoutHire?pn=1">首页</a></li>
                    <c:if test="${page.hasPreviousPage }">
                        <li>
                            <a href="${pageContext.request.contextPath }/cars/carsWithoutHire?pn=${page.pageNum-1}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                    </c:if>
                    <c:forEach items="${page.navigatepageNums}" var="pagenum">
                        <c:if test="${pagenum == page.pageNum}">
                            <li class="active"><a href="#">${pagenum}</a></li>
                        </c:if>
                        <c:if test="${pagenum != page.pageNum}">
                            <li><a href="${pageContext.request.contextPath }/cars/carsWithoutHire?pn=${pagenum}">${pagenum}</a></li>
                        </c:if>
                    </c:forEach>
                    <c:if test="${page.hasNextPage}">
                        <li>
                            <a href="${pageContext.request.contextPath }/cars/carsWithoutHire?pn=${page.pageNum+1}" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                    </c:if>

                    <li><a href="${pageContext.request.contextPath }/cars/carsWithoutHire?pn=${page.pages}">末页</a></li>
                </ul>
            </nav>
        </div>
    </div>
</div>
</body>
</html>