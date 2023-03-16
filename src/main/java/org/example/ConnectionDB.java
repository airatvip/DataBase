package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    static final String USER = "postgres";
    static final String PASSWORD = "l1271064732";
    static final String URL = "jdbc:postgresql://localhost:5432/skypro";

    public static Connection getConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }return connection;

    }

}
