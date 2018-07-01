<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>订单中心</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/UserExchange.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="content">
    <div class="title">Easy-Car易人租车管理系统</div>
    <div class="modify-cars">
        <div class="modify-car">
            <div class="ti">
                <div class="ti-l">订单中心</div>
            </div>
            <table class="table table-striped" border="1">
                <tr>
                    <th width="10%">订单号</th>
                    <th width="10%">车型</th>
                    <th width="20%">取车时间</th>
                    <th width="20%">还车时间</th>
                    <th width="10%">订单状态</th>
                    <th width="10%">费用总计</th>
                </tr>
                <c:forEach items="${page.list}" var="order" varStatus="i">
                    <tr>
                        <td width="10%">
                            <a href="${pageContext.request.contextPath}/orders/orderByOrderNum?userName=${userName}&orderNum=${order.ordernum}">${order.ordernum}</a>
                        </td>
                        <td width="10%">

                        </td>
                        <td width="20%">
                            <fmt:formatDate value="${order.pickuptime}" pattern="yyyy-MM-dd" />
                        </td>
                        <td width="20%">
                            <fmt:formatDate value="${order.returntime}" pattern="yyyy-MM-dd" />
                        </td>
                        <td width="10%">
                            <c:if test="${order.orderstatus == 0}">
                                ${"订单提交"}
                            </c:if>
                            <c:if test="${order.orderstatus == 1}">
                                ${"订单取消"}
                            </c:if>
                            <c:if test="${order.orderstatus == 2}">
                                ${"交易成功"}
                            </c:if>
                        </td>
                        <td width="10%">
                            ${order.ordercost}
                        </td>
                    </tr>
                </c:forEach>
            </table>

            <div class="row">
                <div class="col-md-6">
                    当前${page.pageNum}页,总${page.pages}页,总共多少条${page.total}记录
                </div>
                <div class="col-md-6">
                    <nav aria-label="Page navigation">
                        <ul class="pagination">
                            <li><a href="${pageContext.request.contextPath }/orders/allOrdersByUserName?pn=1&userName=${userName}">首页</a></li>
                            <c:if test="${page.hasPreviousPage }">
                                <li>
                                    <a href="${pageContext.request.contextPath }/orders/allOrdersByUserName?pn=${page.pageNum-1}&userName=${userName}" aria-label="Previous">
                                        <span aria-hidden="true">&laquo;</span>
                                    </a>
                                </li>
                            </c:if>
                            <c:forEach items="${page.navigatepageNums}" var="pagenum">
                                <c:if test="${pagenum == page.pageNum}">
                                    <li class="active"><a href="#">${pagenum}</a></li>
                                </c:if>
                                <c:if test="${pagenum != page.pageNum}">
                                    <li><a href="${pageContext.request.contextPath }/orders/allOrdersByUserName?pn=${pagenum}&userName=${userName}">${pagenum}</a></li>
                                </c:if>
                            </c:forEach>
                            <c:if test="${page.hasNextPage}">
                                <li>
                                    <a href="${pageContext.request.contextPath }/orders/allOrdersByUserName?pn=${page.pageNum+1}&userName=${userName}" aria-label="Next">
                                        <span aria-hidden="true">&raquo;</span>
                                    </a>
                                </li>
                            </c:if>

                            <li><a href="${pageContext.request.contextPath }/orders/allOrdersByUserName?pn=${page.pages}&userName=${userName}">末页</a></li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>

    </div>
</div>

</body>
</html>