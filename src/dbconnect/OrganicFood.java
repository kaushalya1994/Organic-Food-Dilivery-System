/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnect;

import classes.Customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dileeka
 */
public class OrganicFood extends ConnectDB {
   
    
   
     
     
     
     @Override
     public String Userpos(String un,String pw){
         String pos="";
        try {
             
            String sql="select * from USERINFORMATION where username='"+un+"' and password='"+pw+"'";
            
            stmt=con.createStatement();
            
            rs=stmt.executeQuery(sql);
            
            while(rs.next()){
                
              pos=rs.getString("USERCATAGORY");
               
            }
            
        } catch (SQLException ex) {
            
        }
     
              
            return pos;
     
     
     } 
     public int getDBSize(){
   int x=1;
       String sql="select * from DILEEKA.USERINFORMATION";
       try {
           stmt=con.createStatement();
          rs=stmt.executeQuery(sql);
          
          
          while(rs.next()){
          
          x=x+1;
          
          }
           
       } catch (SQLException ex) {
         
       }
   
   
            return x;
   }
    public void AddCustomer(Customer cd){
   
       try {
           String sql="insert into USERINFORMATION values('"+cd.getUsername()+"','"+cd.getPassword()+"','"+cd.getUsercatagory()+"','"+cd.getTelephonenumber()+"','"+cd.getUsermail()+"','"+cd.getUseraddress()+"')";
           
           stmt=con.createStatement();
           
           stmt.executeUpdate(sql);
       } catch (SQLException ex) {
           System.out.println(ex);
          
       }
   
   }
    
}
