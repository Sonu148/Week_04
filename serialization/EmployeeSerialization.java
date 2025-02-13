package com.day_03.serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerialization {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", "IT", 55000));
        employees.add(new Employee(2, "Jane Smith", "HR", 45000));

        // Serialize the list of employees
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employees.ser"))) {
            out.writeObject(employees);
            System.out.println("Employees have been serialized.");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }

        // Deserialize the list of employees
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("employees.ser"))) {
            List<Employee> deserializedEmployees = (List<Employee>) in.readObject();
            System.out.println("Deserialized Employees: " + deserializedEmployees);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}

