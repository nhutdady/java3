package poly.com.controller;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            String sql = "SELECT * FROM Departments";
            ResultSet rs = Jdbc.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("Id") + " - " + rs.getString("Name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
