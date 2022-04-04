package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:mysql://localhost:3306/kata";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "EBA14c86a74gEBA";
    private static Connection connection = null;
    private static Statement statement = null;

    public static Connection connectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection success");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Connection not success");
        }
        return connection;
    }
    public static void closeConnectDB() {
        try {
            if (statement != null) {
                statement.close();
                System.out.println("Statement close");
            }
            if (connection != null) {
                connection.close();
                System.out.println("Connection close");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
