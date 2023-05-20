package com.prudhvi.streams;

import java.util.*;


public class FilteraAndMapCombinationWithObj {

	public static void main(String[] args) {
		List<Employee> eList=Arrays.asList(
		new Employee(1, "Bavigadda", 1000),
		new Employee(3, "Prudhvi", 3000),
		new Employee(4, "raj", 4000),
		new Employee(2, "Kalyan", 2000),
		new Employee(5, "Lokesh", 5000)
		);
		
		//salary>2 print salaries of employee
		eList.stream()
		.filter(emp->emp.getSalary()>2000)
		.map(emp->emp)
		.forEach(emp->System.out.print(emp.getName()+" "));
		

	}

}
class Employee{
	int id;
	String  name;
	int salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
