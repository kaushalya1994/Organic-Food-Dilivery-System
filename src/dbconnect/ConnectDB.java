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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dileeka
 */
public class ConnectDB {
     Connection con;
    Statement stmt;
    ResultSet rs;
    
     public void connectDB() {

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException ex) {

        }
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/data", "data1", "data1");
            
        } catch (SQLException ex) {

        }
    } 
     
     
     
     public String Userpos(String un,String pw){
     
         String pos="";
       
     
              
            return pos;
     
     
     } 
     
    
    
}
