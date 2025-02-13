package com.day_02.queue;
import java.util.*;

public class HospitalTriage {
    // class patient
    static class Patient {
        String name;
        int severity;

        // constructor for intilaise the object
        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>((a, b) -> b.severity - a.severity);

        // Add patients with severity levels
        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        // Process patients in order of severity
        while (!queue.isEmpty()) {
            Patient patient = queue.poll();
            System.out.println(patient.name);  // Output: Alice, John, Bob
        }
    }
}
