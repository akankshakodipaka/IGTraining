package com.TaskSaturday;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        // Create a set of employees
        Set<Employee> employeeSet = employeeService.createEmployeeSet();

        System.out.println("Employees before sorting:");
        employeeService.displayEmployees(new ArrayList<>(employeeSet));

        // Sort employees by empid
        List<Employee> sortedByEmpid = employeeService.sortByEmpid(employeeSet);
        System.out.println("\nEmployees sorted by empid:");
        employeeService.displayEmployees(sortedByEmpid);

        // Sort employees by firstname
        List<Employee> sortedByFirstname = employeeService.sortByFirstname(employeeSet);
        System.out.println("\nEmployees sorted by firstname:");
        employeeService.displayEmployees(sortedByFirstname);
    }
}

