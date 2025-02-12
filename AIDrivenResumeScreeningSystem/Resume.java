package com.day_01.AIDrivenResumeScreeningSystem;
import java.util.ArrayList;
import java.util.List;

class Resume<T extends JobRole> {
    private String candidateName;
    private List<T> jobRoles;

    public Resume(String candidateName) {
        this.candidateName = candidateName;
        this.jobRoles = new ArrayList<>();
    }

    public void addJobRole(T jobRole) {
        jobRoles.add(jobRole);
    }

    public List<T> getJobRoles() {
        return jobRoles;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void printResume() {
        System.out.println("Candidate Name: " + candidateName);
        for (T jobRole : jobRoles) {
            System.out.println("Job Role: " + jobRole.getName());
        }
    }
}