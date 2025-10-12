package poly.com.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import poly.com.model.Departments;

public class DepartmentDao extends Connectdao 
{

  
	///
	public List<Departments> getAllDepartments() {
	 
		List<Departments> departments = new ArrayList<>();
	    String sql = "SELECT * FROM Departments";
	    try {
	        Statement stmt = conn.createStatement();
	        ResultSet rs = stmt.executeQuery(sql);
	        while (rs.next()) {
	            String id = rs.getString("id");
	            String name = rs.getString("Name");
	           String description = rs.getString("Description");
	           departments.add(new Departments(id, name, description));
	        }
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	    return departments;
	}
	///
    public void insertDepartment(String id, String name, String description) {
        String sql = "INSERT INTO Departments (id, Name, Description) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, description);
            ps.executeUpdate();
            System.out.println("Thêm phòng ban thành công!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Sửa phòng ban
    public void updateDepartment(String id, String name, String description) {
        String sql = "UPDATE Departments SET Name = ?, Description = ? WHERE id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, description);
            ps.setString(3, id);
            ps.executeUpdate();
            System.out.println("Cập nhật phòng ban thành công!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Xóa phòng ban
    public void deleteDepartment(String id) {
        String sql = "DELETE FROM Departments WHERE id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
            System.out.println("Xóa phòng ban thành công!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Tìm phòng ban theo ID
    
    public void findDepartmentById(String id) {
        String sql = "SELECT * FROM Departments WHERE id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String name = rs.getString("Name");
                String description = rs.getString("Description");
                System.out.println("Phòng ban ID: " + id + ", Tên: " + name + ", Mô tả: " + description);
            } else {
                System.out.println("Không tìm thấy phòng ban!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    // tra ve mot department khi tim dc
    public Departments findDepartmentById1(String id) {
        Departments department = null;
        String sql = "SELECT * FROM Departments WHERE id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String name = rs.getString("Name");
                String description = rs.getString("Description");
                department = new Departments(id, name, description);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return department;
    }
    //
    /// gọi thủ tục hàm
    public void addDepartment(String id, String name, String description) {
        try {
            CallableStatement stmt = conn.prepareCall("{call sp_AddDepartment(?, ?, ?)}");
            stmt.setString(1, id);
            stmt.setString(2, name);
            stmt.setString(3, description);
            stmt.execute();
            System.out.println("Thêm phòng ban thành công!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    ///
    // Lấy tất cả các phòng ban
    public void printAllDepartments() {
        String sql = "SELECT * FROM Departments";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (!rs.isBeforeFirst()) {
                System.out.println("Không có phòng ban nào!");
                return;
            }
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("Name");
                String description = rs.getString("Description");
                System.out.println("ID: " + id + ", Name: " + name + ", Description: " + description);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    

    
    
}
