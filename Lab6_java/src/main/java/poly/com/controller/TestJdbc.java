package poly.com.controller;

import java.sql.*;

public class TestJdbc {
    public static void main(String[] args) {
        try {
            // Kiểm tra kết nối SELECT
            String sql = "SELECT * FROM Departments";
            ResultSet rs = Jdbc.executeQuery(sql);

            System.out.println("Danh sách phòng ban:");
            while (rs.next()) {
                System.out.println(rs.getString("Id") + " - " + rs.getString("Name"));
            }

            rs.getStatement().close();
            rs.getStatement().getConnection().close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
