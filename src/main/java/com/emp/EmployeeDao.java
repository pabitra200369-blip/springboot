package com.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDao {

    // Add Employee
    public void addEmployee(Employee emp) {

        String sql = "INSERT INTO employees(name,email,department,salary) VALUES(?,?,?,?)";

        try {

            Connection con = Dbconnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, emp.getName());
            ps.setString(2, emp.getEmail());
            ps.setString(3, emp.getDepartment());
            ps.setDouble(4, emp.getSalary());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Added Successfully");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // View All Employees
    public void viewEmployees() {

        String sql = "SELECT * FROM employees";

        try {

            Connection con = Dbconnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            System.out.println("\n------ Employee List ------");

            while (rs.next()) {

                System.out.println(
                        "\nID : " + rs.getInt("id") +
                                "\nName : " + rs.getString("name") +
                                "\nEmail : " + rs.getString("email") +
                                "\nDepartment : " + rs.getString("department") +
                                "\nSalary : " + rs.getDouble("salary")
                );

                System.out.println("--------------------------");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Search Employee By ID
    public void searchEmployee(int id) {

        String sql = "SELECT * FROM employees WHERE id=?";

        try {

            Connection con = Dbconnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("\nEmployee Found");

                System.out.println("ID : " + rs.getInt("id"));
                System.out.println("Name : " + rs.getString("name"));
                System.out.println("Email : " + rs.getString("email"));
                System.out.println("Department : " + rs.getString("department"));
                System.out.println("Salary : " + rs.getDouble("salary"));

            } else {

                System.out.println("Employee Not Found");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Update Employee Salary
    public void updateEmployee(int id, double salary) {

        String sql = "UPDATE employees SET salary=? WHERE id=?";

        try {

            Connection con = Dbconnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, salary);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Updated Successfully");
            } else {
                System.out.println("Employee Not Found");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Delete Employee
    public void deleteEmployee(int id) {

        String sql = "DELETE FROM employees WHERE id=?";

        try {

            Connection con = Dbconnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Deleted Successfully");
            } else {
                System.out.println("Employee Not Found");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}