package com.example.qlsv_oop_group3;

import com.example.qlsv_oop_group3.entity.Course;

public class CourseTest {
    public static void main(String[] args) {
        Course course = new Course("CS101", "Introduction to Programming");

        System.out.println("Test Course:");
        System.out.println("Course ID: " + course.getCourseId());
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("ToString: " + course.toString());
    }
}
