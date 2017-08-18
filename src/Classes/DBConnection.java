/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dulanda
 */
public class DBConnection {
  
/**
 *
 * @author Madawa
 */

    private Connection DBConnection;
    public Connection connect(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Connecting Sucsessfuly");
        
    }
    
   catch(ClassNotFoundException cdds){
       System.out.println("Connection Fail"+cdds);
   }
      String url="jdbc:mysql://localhost:3306/Garage_Management";
      //String url="jdbc:mysql://localhost:3306/garage_management";
      //String url="jdbc:mysql://mgtkandy.ecomdynamic.net:3306/Garage_Management";
       try{
          DBConnection = (Connection) DriverManager.getConnection(url,"root","");
         //DBConnection = (Connection) DriverManager.getConnection(url,"Admin","$oft@rapid");
           System.out.println("Database connect");
           
       }
       catch(SQLException se){
           System.out.println("No Database"+se);
           
       }
       return  DBConnection;
    }
}
