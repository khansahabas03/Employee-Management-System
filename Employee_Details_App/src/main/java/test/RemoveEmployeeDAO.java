package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RemoveEmployeeDAO {
    
    // Method to get the employee's name by ID
    public String getEmployeeNameById(String empId) {
        String employeeName = "";
        try {
            Connection con = DBConnection.getCon();
            String query = "SELECT name FROM Employee61 WHERE ID = ?"; // Assuming 'name' is the column for employee's name
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, empId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                employeeName = rs.getString("name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeName;
    }

    // Method to delete the employee by ID
    public int removeEmployee(String empId) {
        int result = 0;
        try {
            Connection con = DBConnection.getCon();
            String query = "DELETE FROM Employee61 WHERE ID = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, empId);
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
