package com.TaskSaturday;
import java.util.Comparator;
import java.util.Objects;

public class Employee {
    private int empid;
    private String firstname;
    private String lastname;

    // Constructor
    public Employee(int empid, String firstname, String lastname) {
        this.empid = empid;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Getters
    public int getEmpid() {
        return empid;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "Employee{empid=" + empid + ", firstname='" + firstname + "', lastname='" + lastname + "'}";
    }

    // Override equals and hashCode to ensure uniqueness in the collection
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return empid == employee.empid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empid);
    }

    // Comparator to sort employees by empid
    public static Comparator<Employee> EmpidComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return Integer.compare(e1.getEmpid(), e2.getEmpid());
        }
    };

    // Comparator to sort employees by firstname
    public static Comparator<Employee> FirstnameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getFirstname().compareTo(e2.getFirstname());
        }
    };
}
