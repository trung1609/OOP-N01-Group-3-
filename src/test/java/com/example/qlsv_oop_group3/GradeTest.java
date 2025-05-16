package com.example.qlsv_oop_group3;

import com.example.qlsv_oop_group3.entity.Course;
import com.example.qlsv_oop_group3.entity.Grade;

public class GradeTest {
    public static void main(String[] args) {

        Course course = new Course("CS101", "Lập trình cơ bản");

        Grade grade = new Grade(course, 9.5);

        System.out.println("Thông tin Grade:");
        System.out.println("Course: " + grade.getCourse());
        System.out.println("Score: " + grade.getScore());
        System.out.println("ToString: " + grade.toString());
    }
}
