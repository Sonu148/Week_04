package com.day_01.UniversityCourseManagementSystem;
// Exam-based course type
class ExamCourse extends CourseType {
    public ExamCourse(String duration, int courseId) {
        super(duration, courseId);
    }

    @Override
    public String display() {
        return "Exam Course: " + super.display();
    }
}