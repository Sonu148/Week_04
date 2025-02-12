package com.day_01.UniversityCourseManagementSystem;
// Research-based course type
class ResearchCourse extends CourseType {
    public ResearchCourse(String duration, int courseId) {
        super(duration, courseId);
    }

    @Override
    public String display() {
        return "Research Course: " + super.display();
    }
}