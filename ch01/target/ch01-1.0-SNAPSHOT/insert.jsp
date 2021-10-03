<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/1
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <form action="${pageContext.request.contextPath}/insert">
       姓名<input type="text" name="name"/>
       年龄<input type="text" name="age"/>
       地址<input type="text" name="address"/>
       提交<input type="submit" value="注册">
   </form>

</body>
</html>
