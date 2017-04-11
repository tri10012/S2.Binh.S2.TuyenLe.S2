<%-- 
    Document   : editProduct
    Created on : Sep 30, 2016, 1:29:03 PM
    Author     : tris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Edit Product</h1>
        <form action="ControllerProducts">
            Code:${SP.code}<br/>
            Name: <input type="text" name="txtName" value="${SP.name}"/><br/>
            Price: <input type="text" name="txtPrice" value="${SP.price}"/><br/>
            <input type="hidden" name="txtCode" value="${SP.code}"/>
            <input type="submit" name="action" value="Update"/>
            
        </form>
    </body>
</html>
