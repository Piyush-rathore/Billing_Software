/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbconnection;

/**
 *
 * @author dell
 */
import java.sql.*;
import javax.swing.JOptionPane;



public class DbConnection {
    
    static Connection con;
    public static Connection getConnect()
    {
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing_software","root","Piyush@0212");
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error : " +e);
        }
        return con;
    }
    
}
