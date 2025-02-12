package com.day_01.UniversityCourseManagementSystem;

public class Main {
    // Main method to run the system
    public static void main(String[] args) {
        // Create courses for each type
        Course<ExamCourse> examCourse = new Course<>("Mathematics");
        examCourse.addCourse(new ExamCourse("6 months", 101));

        Course<AssignmentCourse> assignmentCourse = new Course<>("Computer Science");
        assignmentCourse.addCourse(new AssignmentCourse("4 months", 102));

        Course<ResearchCourse> researchCourse = new Course<>("Physics");
        researchCourse.addCourse(new ResearchCourse("1 year", 103));

        // Print course details
        System.out.println("Course Details:");
        examCourse.printCourses();
        assignmentCourse.printCourses();
        researchCourse.printCourses();
    }
}
