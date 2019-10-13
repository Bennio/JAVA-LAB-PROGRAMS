package delete_this;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
 
public class Update_Demo {
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
         Statement st =  (Statement) connection.createStatement();
         
            int rs = st.executeUpdate("UPDATE images SET  image = 'elephant' where serial_no = 10 ");
            
            
            System.out.println("\nSQL Connection to database established!");
            
            System.out.println("\n");System.out.println("\n");
           
            
            
            
            
            
 
        } catch (SQLException e) {
            
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