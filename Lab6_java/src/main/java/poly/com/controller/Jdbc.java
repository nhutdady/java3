package poly.com.controller;

import java.sql.*;

public class Jdbc {
    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String dburl = "jdbc:sqlserver://localhost;database=HRM;encrypt=false";
    static String username = "sa";
    static String password = "123456";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // 🔹 Mở kết nối
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dburl, username, password);
    }

    // 🔹 Thực thi INSERT, UPDATE, DELETE
    public static int executeUpdate(String sql) throws SQLException {
        Connection conn = getConnection();
        Statement stmt = conn.createStatement();
        int result = stmt.executeUpdate(sql);

        // đóng kết nối sau khi dùng
        stmt.close();
        conn.close();
        return result;
    }

    // 🔹 Thực thi SELECT
    public static ResultSet executeQuery(String sql) throws SQLException {
        Connection conn = getConnection();
        Statement stmt = conn.createStatement();
        return stmt.executeQuery(sql);
    }
}
