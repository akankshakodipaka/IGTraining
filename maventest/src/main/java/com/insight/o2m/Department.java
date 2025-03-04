package com.insight.o2m;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "igdepto2m1")
public class Department {
	@Id
	private int id;
	private String name;

	@OneToMany(mappedBy="department",cascade=CascadeType.ALL)
	private Set<Employee> employees = new HashSet<>();		//Initialization required to avoid NullPointerException

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	//the method below will add employee to department 
	//also serves the purpose to avoid cyclic references. 
	public void addEmployee(Employee employee) {
		employee.setDepartment(this);			//this will avoid nested cascade
		this.getEmployees().add(employee);
	}

}

