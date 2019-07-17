package java.project;


import java.sql.Connection;
import java.sql.DriverManager;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ankesh
 */
public class ankesh {
public static void main(String s[]) throws Exception
{
Class.forName("com.mysql.jdbc.Driver");
String str="jdbc:mysql://localhost/mandi";
Connection x = DriverManager.getConnection(str,"root","12345");
System.out.println("ankesh");
/*
String query="select * from student";
PreparedStatement ps=x.prepareStatement(query);
ResultSet rs=ps.executeQuery();
while(rs.next()){
a=rs.getString("roll");
b=rs.getString("name");
c=rs.getString("marks");
System.out.println(a+","+b+","+c);
}*/
x.close();
}   
}
