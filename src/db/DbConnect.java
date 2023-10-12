/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Aditya Rastogi
 */
public class DbConnect {
    public static Connection c;
    public static Statement st;
    static {
        try{
            //jdbc code
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/globaltransitdb","root","Aditya@123");
            st = c.createStatement();
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
}
