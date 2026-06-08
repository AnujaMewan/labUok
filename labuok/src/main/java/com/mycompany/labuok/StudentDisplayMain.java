package com.mycompany.labuok;

public class StudentDisplayMain {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        dao.displayAllStudents();
    }
}