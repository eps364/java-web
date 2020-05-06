package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection()
            throws ClassNotFoundException{
        final Connection conex;
        Class.forName("com.mysql.jdbc.Driver");
        try{
            conex = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/time",
                    "root","root");
        }
        catch(SQLException e){
            throw new RuntimeException();
        }
        return conex;
    }
}
