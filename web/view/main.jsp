<%@ page import="com.entities.toys.Toy" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Антон
  Date: 03.03.2019
  Time: 0:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Toy's room</title>
</head>
<body>
<div>
    <h1>Toy's Room</h1>
</div>

<div>
    <h1>Budget:1800</h1>
</div>
<div>
    <div>
        <div>
            <h2>Toys</h2>
        </div>
    <%
          if(request.getAttribute("room")!=null){
            List<Toy> listByCost =(List<Toy>) request.getAttribute("room");
            for (Toy toy:listByCost){
            out.println("<li>" + toy + "</li>");
          }
          }

    %>
    </div>
</div>



<div>
    <form action="sortingByCost" method="post" >
        <button type="submit">Sort by Price</button>


</form>

<form action="sortingBySize" method="post" >
    <button type="submit">Sort by Size</button>


</form>

<form action="sortingByRange" method="post" >
    <button type="submit">Sort by Range</button>


</form>

</div>

</body>
</html>
