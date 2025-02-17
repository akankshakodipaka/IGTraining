package com.TaskSaturday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeService {

    // Method to create a set of employees (using HashSet to avoid duplicates)
    public Set<Employee> createEmployeeSet() {
        Set<Employee> employeeSet = new HashSet<>();
        
        // Adding some sample employees to the set
        employeeSet.add(new Employee(101, "John", "Doe"));
        employeeSet.add(new Employee(102, "Alice", "Smith"));
        employeeSet.add(new Employee(103, "Bob", "Johnson"));
        employeeSet.add(new Employee(104, "Mary", "Williams"));
        employeeSet.add(new Employee(105, "Michael", "Brown"));
        employeeSet.add(new Employee(106, "John", "Davis")); // Duplicate name, different empid
        employeeSet.add(new Employee(103, "Bob", "Johnson")); // Duplicate empid, should be ignored

        return employeeSet;
    }

    // Method to sort employees by empid
    public List<Employee> sortByEmpid(Set<Employee> employeeSet) {
        List<Employee> sortedList = new ArrayList<>(employeeSet);
        Collections.sort(sortedList, Employee.EmpidComparator);
        return sortedList;
    }

    // Method to sort employees by firstname
    public List<Employee> sortByFirstname(Set<Employee> employeeSet) {
        List<Employee> sortedList = new ArrayList<>(employeeSet);
        Collections.sort(sortedList, Employee.FirstnameComparator);
        return sortedList;
    }

    // Method to display the employees
    public void displayEmployees(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}

