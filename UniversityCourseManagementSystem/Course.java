package com.day_01.UniversityCourseManagementSystem;

import java.util.ArrayList;
import java.util.List;

// Generic Course class to manage different types of courses
class Course<T extends CourseType> {
    private String courseName;
    private List<T> courses;

    public Course(String courseName) {
        this.courseName = courseName;
        this.courses = new ArrayList<>();
    }

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }

    // Method to print the details of all courses
    public void printCourses() {
        System.out.println("Course Name: " + courseName);
        for (T course : courses) {
            System.out.println(course.display()); // Displays the course type info
        }
    }
}