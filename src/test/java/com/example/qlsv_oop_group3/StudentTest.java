package com.example.qlsv_oop_group3;

import com.example.qlsv_oop_group3.entity.Course;
import com.example.qlsv_oop_group3.entity.Grade;
import com.example.qlsv_oop_group3.entity.Student;

public class StudentTest {
    public static void main(String[] args) {

        Course course1 = new Course("CS101", "Lập trình cơ bản");
        Course course2 = new Course("MATH201", "Giải tích 2");

        Grade grade1 = new Grade(course1, 8.5);
        Grade grade2 = new Grade(course2, 9.2);

        Student student = new Student("S001", "Nguyen Van A");
        student.addGrade(grade1);
        student.addGrade(grade2);

        System.out.println("Thông tin sinh viên:");
        System.out.println(student);
        for (Grade grade : student.getGrades()) {
            System.out.println("  " + grade);
        }
    }
}
