package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:mysql://localhost:3306/kata";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "EBA14c86a74gEBA";

    public static Connection connectDB() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Подключение состоялось");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Подключение не состоялось");
        }
        return connection;

    }
}
