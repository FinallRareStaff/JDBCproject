package jm.task.core.jdbc;

import jm.task.core.jdbc.util.Util;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Util.connectDB();
    }
}
