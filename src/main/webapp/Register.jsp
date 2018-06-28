<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/UserRegister.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/necessaryMethod.js"></script>
    <script type="text/javascript">
        function onClicked() {
            var telephone = document.getElementById("telephone").value;
            var userName = document.getElementById("userName").value;
            var userPassword = document.getElementById("userPassword").value;
            var userPasswordVerification = document.getElementById("userPasswordVerification").value;

            if (telephone.length == 0)
                alert("telephone不能为空");
            else if (userName.length == 0)
                alert("userName不能为空");
            else if (userPassword.length == 0)
                alert("userPassword不能为空");
            else if (userPasswordVerification.length == 0)
                alert("userPasswordVerification不能为空");
            else
                document.myform.submit();
        }
    </script>
</head>
<body>
<div class="content">
    <div class="title">
        <div>欢迎登录</div>
        <div>如果您已是会员，请点击<a href="${pageContext.request.contextPath}/Login.jsp">登录</a></div>
    </div>
    <input type="hidden" id="isExist" value="${isExist}">
    <script type="text/javascript">
         if (document.getElementById("isExist").value.length != 0)
             alert("用户名已经存在");
    </script>
    <div class="sign-up">
        <form action="${pageContext.request.contextPath}/register/userInsert" method="post" name="myform">
            <table border="0">
                <tr>
                    <td>
                        <label for="telephone">手机号：</label>
                        <input type="text" name="telephone" id="telephone" placeholder="请输入您的手机号码" class="inputfield"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="username">用户名:</label>
                        <input type="text" name="userName" id="userName"  placeholder="*请输入您的真实的名字" class="inputfield" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="userPassword">密码：</label>
                        <input type="password" name="userPassword" id="userPassword" placeholder="6-18位数字" class="inputfield"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="userPasswordVerification">重新输入:</label>
                        <input type="password" name="userPasswordVerification" id="userPasswordVerification" placeholder="再次确认密码" class="inputfield"/>
                    </td>
                </tr>
                <tr>
                    <td><input type="checkbox" checked="checked">我已阅读《易人租车会员服务条款》</td>
                </tr>
                <tr>
                    <td ><input type="button" value="注册" onclick="onClicked()" class="submit"></td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
</html>
