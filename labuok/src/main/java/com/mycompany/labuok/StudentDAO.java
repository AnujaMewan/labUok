package com.mycompany.labuok;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {

    public void addStudent(Student student) {

        String sql = "INSERT INTO students(student_id, student_name, mark) VALUES (?, ?, ?)";

        try (Connection conn =
                     StudentDatabaseConnection.getConnection();
             PreparedStatement stmt =
                     conn.prepareStatement(sql)) {

            stmt.setInt(1, student.getStudentId());
            stmt.setString(2, student.getStudentName());
            stmt.setInt(3, student.getMark());

            stmt.executeUpdate();

            System.out.println("Student added successfully.");

        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }  
    public void displayAllStudents() {

    String sql = "SELECT student_id, student_name, mark FROM students";

    try (Connection conn =
                 StudentDatabaseConnection.getConnection();
         PreparedStatement stmt =
                 conn.prepareStatement(sql);
         java.sql.ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {

            System.out.println(
                    "ID: " + rs.getInt("student_id")
                    + ", Name: " + rs.getString("student_name")
                    + ", Mark: " + rs.getInt("mark"));
        }

    } catch (SQLException e) {
        System.out.println("Database Error: " + e.getMessage());
    }
}
        
    }

    
