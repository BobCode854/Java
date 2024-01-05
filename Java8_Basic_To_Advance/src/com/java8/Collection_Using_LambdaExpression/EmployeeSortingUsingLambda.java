package com.java8.Collection_Using_LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee
{
	private int empNo;
	private String name;
	
	public Employee(int empNo,String name) {
		this.empNo = empNo;
		this.name = name;
	}
	
	
	public int getEmpNo() {
		return empNo;
	}


	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String toString() {
		return empNo + " : " + name ;
	}
}
public class EmployeeSortingUsingLambda 
{
	public static void main(String args[]) {
		ArrayList<Employee> list_of_employees = new ArrayList<Employee>();
		list_of_employees.add(new Employee(86755, "Karan"));
		list_of_employees.add(new Employee(36765, "Rahul"));
		list_of_employees.add(new Employee(96725, "Manish"));
		list_of_employees.add(new Employee(26755, "Priya"));
		list_of_employees.add(new Employee(16755, "Mahi"));
		list_of_employees.add(new Employee(76755, "Chandani"));
		System.out.println("List of EMployee Before Sorting : "+list_of_employees);

		// Sorting based on EMployee Id
		Comparator<Employee> sortingBasedOnEmpId = (e1, e2) -> (e1.getEmpNo() > e2.getEmpNo()) ? +1
				: (e1.getEmpNo() < e2.getEmpNo()) ? -1 : 0;
		Collections.sort(list_of_employees,sortingBasedOnEmpId);
		System.out.println("List of Employee After Sorting Based on EmpNo : "+list_of_employees);
		
		// Sorting Based on Employee Name (default is alphabetical order )
		
		Comparator<Employee> sortingBasedOnEmpName = (e1, e2) -> (e1.getName().compareTo(e2.getName()));
		Collections.sort(list_of_employees,sortingBasedOnEmpName);
		System.out.println("List of Employee After Sorting Based on EmpName : "+list_of_employees);
		
		
	}
	
	
	
	
}
