
package com.example.qlsv_oop_group3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {

    @Id
    private String studentId;

    private String name;

    @OneToMany
    private List<Grade> grades = new ArrayList<>();

    // Constructor không tham số (bắt buộc với JPA)
    public Student() {
    }

    // Constructor có tham số
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Getter và Setter
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    @Override
    public String toString() {
        return studentId + " - " + name + " (" + grades.size() + " grades)";
    }
}


