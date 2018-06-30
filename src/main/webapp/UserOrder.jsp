<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/UserOrder.css"/>
    </head>
   <body>
    	<div class="content">
    		<div class="title">Easy-Car易人租车管理系统</div>
    		<div class="modify-cars">
				<div class="modify-car">
					<div class="ti">
						<div class="ti-l">订单提交成功</div>
						<div class="ti-r">应付总价:${order.ordercost}</div>
					</div>
					<div class="ti-detail">
						<div class="order-no">订单号: ${order.ordernum}</div>
						<div class="order-name">租车人:${order.username}</div>
						<div class="order-date">租期${order.pickuptime}~${order.returntime}</div>
					</div>
					<div class="car-message">车辆信息</div>
					<div class="cars-description">
						<table border="0">
							<tr>
								<td>取车时间</td>
								<td>
									${order.pickuptime}
								</td>
							</tr>
							<tr>
								<td>还车时间</td>
								<td>
									${order.returntime}
								</td>
							</tr>
							<tr>
								<td>
									<input type="submit" value="提交" class="submit"/>
								</td>
							</tr>
						</table>
					</div>
				</div>
			</div>
    	</div>
 	</body>
</html>