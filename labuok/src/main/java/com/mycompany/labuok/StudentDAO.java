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

    
}