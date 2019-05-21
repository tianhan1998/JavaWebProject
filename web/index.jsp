<%@ page language="java"  import="java.util.*" pageEncoding="utf-8" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="SaveUser" method="post">
    输入学号:<input type="text" name="Sno"/><br/>
    输入姓名:<input type="text" name="Sname"/><br/>
    输入年龄:<input type="text" name="Sage"/><br/>
    输入性别:<input type="text" name="Ssex"/><br/>
    输入地址:<input type="text" name="Saddress"/>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>
