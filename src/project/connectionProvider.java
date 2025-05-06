/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author elmnshawy
 */
//import java.sql.*;
import java.sql.DriverManager ;
import java.sql.Connection;
public class connectionProvider {
    
        public static Connection getCon()
        {
            try
            {
              
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel" , "root" ,"Mkh@3032024M");
                return con;
                
               
            }
            catch(Exception e) 
            {
                return null ;
            }                
        }       
        
        
                
}
