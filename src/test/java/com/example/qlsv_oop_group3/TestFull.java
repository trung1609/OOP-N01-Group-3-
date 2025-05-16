package com.example.qlsv_oop_group3;

import com.example.qlsv_oop_group3.entity.Course;
import com.example.qlsv_oop_group3.entity.Grade;
import com.example.qlsv_oop_group3.entity.Student;

public class TestFull {
    public static void main(String[] args) {
        Course course1 = new Course("CS101", "Lập trình Java");
        Course course2 = new Course("MATH201", "Giải tích");

        Student student = new Student("S001", "Nguyen Van A");

        Grade grade1 = new Grade(course1, 8.5);
        Grade grade2 = new Grade(course2, 9.0);


        student.addGrade(grade1);
        student.addGrade(grade2);


        System.out.println("====== THÔNG TIN SINH VIÊN ======");
        System.out.println("Mã số: " + student.getStudentId());
        System.out.println("Họ tên: " + student.getName());
        System.out.println("Danh sách điểm:");

        for (Grade grade : student.getGrades()) {
            System.out.println("  - " + grade.getCourse().getCourseId() + " - " +
                    grade.getCourse().getCourseName() + ": " +
                    grade.getScore());
        }

        System.out.println("=================================");
    }
}
