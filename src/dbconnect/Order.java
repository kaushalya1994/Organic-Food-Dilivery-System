/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dileeka
 */
public class Order {
    Connection con;
    Statement stmt;
    ResultSet rs;
        public static Connection ConnectItem() {
     try{
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException ex) {

        }
        
          Connection  con = DriverManager.getConnection("jdbc:derby://localhost:1527/data", "data1", "data1");
            return con;
        } catch (SQLException ex) {
return null;
        }
    }
      public void connectDB() {

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException ex) {

        }
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/OrganicFoodSystem", "dileeka", "dileeka");
            
        } catch (SQLException ex) {

        }
    }
}
