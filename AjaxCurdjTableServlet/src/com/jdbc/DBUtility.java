package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {
	private static Connection connection = null;

	static Connection con;
    static String url;
          
    public static Connection getConnection()
    {
//    	http://www.simplecodestuffs.com/ajax-based-crud-operations-in-jsp-and-servlet-using-jtable-jquery-plug-in/
       try
       {
          String url = "jdbc:mysql://us-cdbr-azure-southcentral-e.cloudapp.net:3306/sapo"; 
          // assuming "DataSource" is your DataSource name

          Class.forName("com.mysql.jdbc.Driver");
          
          try
          {            	
             con = DriverManager.getConnection(url,"b7dcaee654fb50","e3b87809"); 
              								
          // assuming your SQL Server's	username is "username"               
          // and password is "password"
               
          }
          
          catch (SQLException ex)
          {
             ex.printStackTrace();
          }
       }

       catch(ClassNotFoundException e)
       {
          System.out.println(e);
       }

    return con;
}
}