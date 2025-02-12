package com.day_01.AIDrivenResumeScreeningSystem;

import java.util.List;

class ScreeningPipeline {
    public static void screenResumes(List<? extends JobRole> jobRoles) {
        for (JobRole jobRole : jobRoles) {
            System.out.println("Screening for: " + jobRole.getName());
        }
    }
}