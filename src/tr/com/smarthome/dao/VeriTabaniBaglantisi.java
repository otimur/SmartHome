package tr.com.smarthome.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VeriTabaniBaglantisi {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "org.firebirdsql.jdbc.FBDriver";  
   static final String DB_URL = "jdbc:firebirdsql://localhost:3050/c:\\DENEME.FDB";

   //  Database credentials
   static final String USER = "SYSDBA";
   static final String PASS = "masterkey";
   
   public static ResultSet sorgula(String sql) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName(JDBC_DRIVER);

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      return rs;
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
   }//end try
   return null;
}//end main
}//end FirstExample