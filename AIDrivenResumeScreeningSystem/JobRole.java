package com.day_01.AIDrivenResumeScreeningSystem;
abstract class JobRole {
    private String name;

    public JobRole(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}