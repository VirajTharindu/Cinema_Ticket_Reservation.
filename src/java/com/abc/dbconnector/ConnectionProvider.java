
package com.abc.dbconnector;
import java.sql.*;
/**
 *
 * @author shami
 */
public class ConnectionProvider {
   public static Connection getCon(){
         
         try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc_cinema?useSSL=false","root","");
             return con;
         }catch(Exception e){
             System.out.print(e);
             return null;
         }
         
     }
}
