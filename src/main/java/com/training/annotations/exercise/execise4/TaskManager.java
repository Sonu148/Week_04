package com.training.annotations.exercise.execise4;

public class TaskManager {

    @TaskInfo(priority = 1, assignedTo = "person1")
    public void performTask() {
        System.out.println("Performing task...");
    }
}
