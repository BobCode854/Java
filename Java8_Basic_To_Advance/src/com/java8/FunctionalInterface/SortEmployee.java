package com.java8.FunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee
{
	private int id;
	private String name;
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
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}
public class SortEmployee {

	public static void main(String[] args) {
	
		Employee e1=new Employee(1300111,"Karan");
		Employee e2=new Employee(1300339,"Anish");
		Employee e3=new Employee(1300158,"Vishal");
		Employee e4=new Employee(1300255,"Manish");
		Employee e5=new Employee(1300857,"Suraj");
		
		ArrayList<Employee> listEmployee=new ArrayList<Employee>();
		listEmployee.add(e1);
		listEmployee.add(e2);
		listEmployee.add(e3);
		listEmployee.add(e4);
		listEmployee.add(e5);

		Comparator<Employee> compareById = (emp1,emp2)->(emp1.getId()<emp2.getId())? -1 : (emp1.getId()>emp2.getId()) ? +1:0;
		Comparator<Employee> compareByName = (emp1,emp2)->(emp1.getName().compareTo(emp2.getName()));
		System.out.println("Employee Object without Comparator : "+listEmployee);
		Collections.sort(listEmployee,compareById);
		System.out.println("Employee Object After Comparator With EmpId : "+listEmployee);
		Collections.sort(listEmployee,compareByName);
		System.out.println("Employee Object After Comparator With EmployeeName : "+listEmployee);
	}

}
