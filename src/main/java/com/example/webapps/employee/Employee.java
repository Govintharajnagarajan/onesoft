package com.example.webapps.employee;

public class Employee {
	private String name;
	private int age;
	private int salary;
	private String role;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Employee(String name, int age, int salary, String role) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", role=" + role + "]";
	}

}
