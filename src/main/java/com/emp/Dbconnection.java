package com.emp;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {

    public static Connection getConnection() {

        try {

            String url = "jdbc:mysql://localhost:3306/employee_management";
            String username = "root";
            String password = "pabitra@2003"; // apna password

            return DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
