/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Dileeka
 */
public class Customer {
  //  private String logingid;
    private String telephonenumber;
    private String username;
    private String password;
    private String usercatagory;
    private String useraddress;
    private String usermail;

    public Customer( String telephonenumber, String username, String password, String usercatagory, String useraddress, String usermail) {
        
        this.telephonenumber = telephonenumber;
        this.username = username;
        this.password = password;
        this.usercatagory = usercatagory;
        this.useraddress = useraddress;
        this.usermail = usermail;
    }

  

    public String getTelephonenumber() {
        return telephonenumber;
    }

    public void setTelephonenumber(String telephonenumber) {
        this.telephonenumber = telephonenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsercatagory() {
        return usercatagory;
    }

    public void setUsercatagory(String usercatagory) {
        this.usercatagory = usercatagory;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public String getUsermail() {
        return usermail;
    }

    public void setUsermail(String usermail) {
        this.usermail = usermail;
    }
    
    
}
