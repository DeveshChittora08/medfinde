package vgt.java10.medfinder;

import java.sql.*;
public class MyLib 
{
    public Connection getConnection()
    {
        Connection cn=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            //Create connection
            String dbpath="jdbc:mysql://localhost:3306/mad_find_db";
            String dbuser="root";
            String dbpass="";
            cn=DriverManager.getConnection(dbpath, dbuser, dbpass);
        }
        catch(Exception e)
        {
            System.out.println ("Error in getconnection "+e);
        }
        return cn;
    }
}
