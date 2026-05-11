package com.example.lab4_faiz; // Replace with your actual package name

public class Course {
    String courseId;
    String courseName;

    // Blank constructor required for Firebase
    public Course() {
    }

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}