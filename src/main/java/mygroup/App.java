package mygroup;
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.sql.DriverManager; 
import java.util.*;
import java.sql.*; 
import java.sql.Connection;
import java.sql.Statement;
import java.io.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
       Class.forName("com.mysql.jdbc.Driver");
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/nageshdb","root","nagesh");  
       Statement st = conn.createStatement();
        st.executeQuery("create table students(id integer,name varchar(10))");
       st.executeQuery("insert into students values (35,'nagesh')");
       ResultSet rs = st.executeQuery("select * from students");
       while(rs.next())
     {
         String did = rs.getString("id");
         String dname = rs.getString("name");
 
        System.out.println( "name:" +dname );
}
    }
}
