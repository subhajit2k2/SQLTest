package src;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author SHIBHAM
 */



import java.sql.*;
import javax.swing.JOptionPane;
public class DbCon {
    
    private static Connection con;   
    public static void getConnection(String url, String uname, String pwd) {
        
        try {
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection(url, uname, pwd);
        }
        catch(Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in Connectivity!");
        }
    }
    
    public static Connection getCon() {
        return con;
    }
}
