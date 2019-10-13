package delete_this;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
 
public class sql_test {
    public static void main(String[] argv) {
 
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found !!");
            return;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;
        try {
            connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/Object_Detection", "root", "");
         Statement st = (Statement) connection.createStatement();
         
            ResultSet rs = st.executeQuery("select * from images");
            //ResultSetMetaData rsmd = rs.getMetaData();
            
//            char  hi = rs.toString();
            
            System.out.println("\nSQL Connection to database established!");
            while(rs.next())
            {
        	   //System.out.println("hello");

        	   System.out.println("\n");
        	   //System.out.println(rsmd.getColumnName(1) + " " + rsmd.getColumnName(2));
        	   System.out.print(rs.getInt(1)+" | " +rs.getString(2));
        	   
        	   
        	   
           }
           
            
            System.out.println("\n");System.out.println("\n");
           
            
            
            
            
            
 
        } catch (SQLException e) {
            //System.out.println("Connection Failed! Check output console");
            return;
        } finally {
            try
            {
                if(connection != null)
                    connection.close();
                System.out.println("Connection closed !!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}