package com.training.day_05.junit.basicjunit;

public class PerformanceTester {
    public static String longRunningTask() {
        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Task Completed";
    }

    public static void main(String[] args) {
        System.out.println("Starting long-running task...");
        System.out.println(longRunningTask());
    }
}
