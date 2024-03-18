<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2024/3/18
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h2>
    <%--              基本数据类型--%>
    <a href="transfer/deal1?val=10&name=lei">deal1</a>
</h2>

<h2>
    <!-- pojo 类型演示 -->
    <form action="transfer/deal2" method="post">
        账户名称：<input type="text" name="name" ><br/>
        账户金额：<input type="text" name="money" ><br/>
        账户省份：<input type="text" name="address.provinceName" ><br/>
        账户城市：<input type="text" name="address.cityName" ><br/>
        <input type="submit" value=" 保存 ">
    </form>
</h2>
<h2>
    <!-- POJO 类包含集合类型演示 -->
    <form action="transfer/deal3" method="post">
        用户名称：<input type="text" name="username" ><br/>
        用户密码：<input type="password" name="password" ><br/>
        用户年龄：<input type="text" name="age" ><br/>
        账户 1 名称：<input type="text" name="accounts[0].name" ><br/>
        账户 1 金额：<input type="text" name="accounts[0].money" ><br/>
        账户 2 名称：<input type="text" name="accounts[1].name" ><br/>
        账户 2 金额：<input type="text" name="accounts[1].money" ><br/>
        账户 3 名称：<input type="text" name="accountMap['one'].name" ><br/>
        账户 3 金额：<input type="text" name="accountMap['one'].money" ><br/>
        账户 4 名称：<input type="text" name="accountMap['two'].name" ><br/>
        账户 4 金额：<input type="text" name="accountMap['two'].money" ><br/>
        <input type="submit" value=" 保存 ">
    </form>

</h2>
<h2>

    <!-- 特殊情况之：类型转换问题 -->
    <a href="transfer/deal4?date=2018-01-01">根据日期删除账户</a>
</h2>
</body>
</html>
