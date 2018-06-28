<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Easy-Car易人租车管理系统</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/UserLogin.css"/>
		<script src="${pageContext.request.contextPath}/js/necessaryMethod.js" type="text/javascript"></script>
    </head>
    <body>
    	<div class="content">
			<div class="title">
				Easy-Car租车系统
			</div>
			<div class="user-login">
				<div class="login-content">
					<div class="description">
						<form action="${pageContext.request.contextPath}/login/check" method="post" name="myform">
							<table border="0">
								<tr>
									<td colspan="2">
										<label for="userName">账号:</label>
										<input type="text" name="userName" id="userName" placeholder="请输入账号" value="${userName}"/>
										<script type="text/javascript">
                                            // var userName = getQueryString("userName");
                                            // if (userName != null) {
                                            //     alert("密码或者账号错误");
                                            //     document.getElementById("userName").setAttribute('value', userName);
                                            // }
											if (document.getElementById("userName").value.length != 0)
											    alert("密码或者账号错误");
										</script>
									</td>
								</tr>
								<tr>
									<td colspan="2">
										<label for="userPassword">密码:</label>
										<input type="text" name="userPassword" id="userPassword" placeholder="请输入密码" />
									</td>
								</tr>
								<tr>
									<td>
										<input type="submit" value="提交" class="submit"/>
                                        <br>
                                        <a href="Register.html">注册</a>
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