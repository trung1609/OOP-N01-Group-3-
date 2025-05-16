package com.example.qlsv_oop_group3.entity;

import jakarta.persistence.*;

@Entity
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Course course;

    private double score;

    // Constructor không tham số (JPA yêu cầu)
    public Grade() {
    }

    // Constructor có tham số
    public Grade(Course course, double score) {
        this.course = course;
        this.score = score;
    }

    // Getter và Setter
    public Long getId() {
        return id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return course.toString() + ": " + score;
    }
}
