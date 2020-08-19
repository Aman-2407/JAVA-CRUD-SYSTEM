/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demoproject;
import java.sql.*;/**

/**
 *
 * @author AMAN
 */
public class Dbconnection {
    Connection con;
    void connection() throws SQLException
    {
        try
        {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Verma", "aman", "12345");
               
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
