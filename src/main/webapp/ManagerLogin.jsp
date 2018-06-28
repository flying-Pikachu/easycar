<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/ManagerLogin.css"/>
		<script src="js/necessaryMethod.js" type="text/javascript"></script>
    </head>
    <body>
    	<div class="content">
			<div class="title">
				Easy-Car易人租车管理系统
			</div>
			<div class="manager-login">
				<div class="login-content">
					<div class="description">
					<form action="${pageContext.request.contextPath}/login/checkManager" method="post">
						<table border="0">
						
						<tr>
							<td>
								<label for="userName">账号:</label><input type="text" name="userName" id="userName" placeholder="请输入账号" value="${userName}"/>
								<script type="text/javascript">
                                    if (document.getElementById("userName").value.length != 0)
                                        alert("密码或者账号错误");
								</script>
							</td>
						</tr>
						<tr>
							<td><label for="userPassword">密码:</label><input type="text" name="userPassword" id="userPassword" placeholder="请输入密码" /></td>
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