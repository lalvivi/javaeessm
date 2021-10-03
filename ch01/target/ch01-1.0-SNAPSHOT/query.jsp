<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/1
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function (){
            $("#btn").click(function (){
                $.ajax({
                    url:"${pageContext.request.contextPath}/query",
                    type:"get",
                    dataType:"json",
                    success:function (data){
                        $("#info").html("")
                       $.each(data,function (i,n){
                           $("#info").append("<tr>")
                            .append("<td>"+n.id+"<td>")
                             .append("<td>"+n.name+"<td>")
                             .append("<td>"+n.age+"<td>")
                             .append("<td>"+n.address+"<td>")


                        })
                    }
                }


                )
            })
        })

    </script>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>学号</td>

        <td>姓名</td>

        <td>年龄</td>

        <td>地址</td>
    </tr>
    </thead>
    <tbody id="info">

    </tbody>




</table>
 <input type="button" value="更新数据" id="btn">

</body>
</html>
