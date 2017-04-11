<%-- 
    Document   : newKhachhang
    Created on : Oct 20, 2016, 11:07:09 AM
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
        <h1>New Khach Hang </h1>
        <form action="ControllerKhachhang">
            MaKH: <input type="text" name="txtMaKH" value=""/><br/>
            MatKhau:<input type="text" name="txtMatKhau" value=""/><br/>
            HoVaTen:<input type="text" name="txtHoVaTen" value=""/><br/>
            Emai:<input type="text" name="txtEmail" value=""/><br/>
            SoDT:<input type="text" name="txtSoDT" value=""/><br/>
            <input type="submit" name="action" value="Insert"/>
        </form>
    </body>
</html>
