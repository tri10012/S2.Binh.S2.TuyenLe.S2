/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tris
 */
public class Products {
    public void delete(String masp){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/assignsof301";
            Connection con=DriverManager.getConnection(url,"root","");
            String sql = "delete from products where Code=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, masp);
            stm.executeUpdate();
            stm.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public List<Product> showProduct(String tensp){
    try{
        Connection con=null;
        Statement stm=null;
         Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/assignsof301";
        con=DriverManager.getConnection(url,"root","");
        String sql="select * from products";
        if(tensp.length()>0){
            sql += " where Name like '%"+tensp+"%'";
        }
        stm=con.createStatement();
        ResultSet rs=stm.executeQuery(sql);
        List<Product> list =new ArrayList<Product>();
        while(rs.next()){
            String code=rs.getString("Code");
            String name=rs.getString("Name");
            float price=rs.getFloat("Price");
            Product sp=new Product(code,name,price);
            list.add(sp);
        }
        return list;
    }   catch(Exception e){
    e.printStackTrace();
    }
    return null;
    }
    
    public void insert(String masp,String tensp,float gia ){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/assignsof301";
            Connection con=DriverManager.getConnection(url,"root","");
            String sql = "insert into products values(?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, masp);
            stm.setString(2, tensp);
            stm.setFloat(3, gia);
            stm.executeUpdate();
            stm.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void update(String masp,String tensp,float gia){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/assignsof301";
            Connection con=DriverManager.getConnection(url,"root","");
            String sql = "update products set Name=?,Price=? where Code=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, tensp);
            stm.setFloat(2, gia);
            stm.setString(3, masp);
            stm.executeUpdate();
            stm.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    
        
    }
    
    public void edit(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/assignsof301";
            Connection con=DriverManager.getConnection(url,"root","");
            String sql="update products set Name=?,Price=? where Code=?";
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.executeUpdate();
            stm.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    
}
