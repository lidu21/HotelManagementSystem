package com.example.hotelmanagementsystem;
import java.sql.*;
public class DatabaseConn {
    Connection connection= null;

    final static String URL= "jdbc:oracle:thin:@localhost:1521:xe";
    final static String USER= "TEST";
    final static String PASSWORD= "123";
    final static String DRIVER= "oracle.jdbc.driver.OracleDriver";


    public Connection connectionMethod(){
        try{
Class.forName(DRIVER);
connection = DriverManager.getConnection(URL,USER,PASSWORD);
return connection;
}
        catch (Exception e){
            e.printStackTrace();
        }


        return connection;
    }
}
