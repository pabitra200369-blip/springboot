package Dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbutil {
    private static final String URL = "jdbc:mysql://localhost:3306/employee_management";
    private static final String user="root";
    private static final String pass="pabitra22003";
    private static Connection connection=null;
    public  void connect(){
        try {
            connection= DriverManager.getConnection(URL,user,pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}