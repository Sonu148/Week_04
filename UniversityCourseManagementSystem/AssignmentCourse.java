package com.day_01.UniversityCourseManagementSystem;
// Assignment-based course type
class AssignmentCourse extends CourseType {
    public AssignmentCourse(String duration, int courseId) {
        super(duration, courseId);
    }

    @Override
    public String display() {
        return "Assignment Course: " + super.display();
    }
}