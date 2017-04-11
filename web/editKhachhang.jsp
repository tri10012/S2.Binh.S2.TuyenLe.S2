<%-- 
    Document   : editKhachhang
    Created on : Oct 20, 2016, 10:30:52 AM
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
        <h1>Edit Khach Hang</h1>
        <form action="ControllerKhachhang">
            MaKhachHang:${KH.maKhachHang}<br/>
            MatKhau:<input type="text" name="txtMatKhau" value="${KH.matKhau}"/><br/>
            HoVaTen:<input type="text" name="txtHoVaTen" value="${KH.hoVaTen}"/><br/>
            Emai:<input type="text" name="txtEmail" value="${KH.email}"/><br/>
            SoDT:<input type="text" name="txtSoDT" value="${KH.soDT}"/><br/>
            <input type="hidden" name="txtMaKH" value="${KH.maKhachHang}"/>
            <input type="submit" name="action" value="Update"/>
        </form>
    </body>
</html>
