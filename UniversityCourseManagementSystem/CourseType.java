package com.day_01.UniversityCourseManagementSystem;
// Abstract class to represent the course evaluation type
abstract class CourseType {
    private String duration;
    private int courseId;

    public CourseType(String duration, int courseId) {
        this.duration = duration;
        this.courseId = courseId;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    // Display method for course information
    public String display() {
        return "The course duration is " + duration + " and course id is " + courseId;
    }
}