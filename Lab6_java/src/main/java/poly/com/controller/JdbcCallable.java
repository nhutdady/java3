package poly.com.controller;

import java.sql.*;

public class JdbcCallable {
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

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dburl, username, password);
    }

    public static ResultSet executeQuery(String sql, Object... values) throws SQLException {
        Connection conn = getConnection();
        CallableStatement cs = conn.prepareCall(sql);
        for (int i = 0; i < values.length; i++) {
            cs.setObject(i + 1, values[i]);
        }
        return cs.executeQuery();
    }
}
