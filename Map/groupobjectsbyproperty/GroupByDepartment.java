package com.day_02.Map.groupobjectsbyproperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupByDepartment {
    public static void main(String[] args) {
        // create a list employee
        List<Employee> employees = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        // create a hashmap
        Map<String, List<Employee>> groupedByDept = new HashMap<>();
        for (Employee emp : employees) {
            groupedByDept.computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>()).add(emp);
        }

        // Output grouped by department
        groupedByDept.forEach((dept, emps) -> {
            System.out.println(dept + ": " + emps.stream().map(Employee::getName).toList());
        });
    }
}