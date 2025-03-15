package _12_interview_question;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee
{
	private int empId;
	private String empName;
	private double salary;
	private String designation;
	private String gender;
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", designation="
				+ designation + ", gender=" + gender + "]";
	}
	
	public Employee(int empId, String empName, double salary, String designation, String gender) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.designation = designation;
		this.gender = gender;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

public class Operation_on_List_Of_Employee {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(124, "Karan", 22000, "Developer","Male"));
		empList.add(new Employee(131, "Rahul", 21000, "Tester","Male"));
		empList.add(new Employee(113, "Mahi", 45000, "Developer","Female"));
		empList.add(new Employee(156, "Bob", 25000, "Developer","Male"));
		empList.add(new Employee(272, "Gunnu", 32000, "Devops","Female"));
		empList.add(new Employee(24, "Rishi", 72000, "Devops","Male"));
		empList.add(new Employee(327, "Srijani", 12000, "Tester","Female"));

		/**
		 * 1) Find the average salary of each department.
		 */

		Map<String, Double> departmentWiseAverageSalary = empList.stream().collect(
				Collectors.groupingBy(Employee::getDesignation, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(departmentWiseAverageSalary);

		/**
		 * 2) Find the total salary of the organisation.
		 */
		double totalSalary = empList.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println("totalSalary : " + totalSalary);

		/**
		 * 3) Calculate the average salary of the organisation
		 */

		Double averageSalaryOfOrganisation = empList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println("average salary of organisation : " + averageSalaryOfOrganisation);

		/**
		 * 4) Find employee having highest salary in the organisation.
		 */
		Employee employeeHavingHighestSalary = empList.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().orElse(null);
		System.out.println("Employee having highest salary : " + employeeHavingHighestSalary);
		
		/**
		 * 5) Find employee having second highest salary in the organisation.
		 */
		Employee employeeHavingSecondHighestSalary = empList.stream()
				.sorted((e1,e2)->Double.compare(e1.getSalary(), e2.getSalary())).distinct().skip(1).findFirst().orElse(null);
		System.out.println("Employee having second highest salary : " + employeeHavingSecondHighestSalary);
		
		/**
		 * 6) Find Employee having Highest salary from each department
		 */
		            
		Map<String, Optional<Employee>> highestSalaryFromEachDepartment = empList.stream().collect(Collectors
				.groupingBy(Employee::getDesignation, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		
		System.out.println("highestSalaryFromEachDepartment : "+highestSalaryFromEachDepartment);
		
		/**
		 * 7) How many Male and Female Employees are there
		 */
		Map<String, Long> maleAndFemaleCount = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("maleAndFemaleCount : " + maleAndFemaleCount);

		/**
		 * 8) Print the name of all the department in the organisation
		 */
		empList.stream().map(emp -> emp.getDesignation()).distinct().forEach(System.out::println);

		/**
		 * 9) Gender wise average salary
		 */
		Map<String, Double> genderWiseAverageSalary = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("genderWiseAverageSalary : " + genderWiseAverageSalary);

		/**
		 * 10) Count the number of employees in each department
		 */
		Map<String, Long> departmentWiseTotalEmployees = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDesignation, Collectors.counting()));
		
		System.out.println("departmentWiseTotalEmployees : "+departmentWiseTotalEmployees);
		
		/**
		 * 11) Sort the employee based on their names
		 */
		List<Employee> sortedListbasedOnEmpName = empList.stream().sorted(Comparator.comparing(Employee::getEmpName))
				.collect(Collectors.toList());
		System.out.println("sortedListbasedOnEmpName : " + sortedListbasedOnEmpName);
		
		/**
		 * 12) Sort the employee based on their names reverse Order
		 */

		List<Employee> sortedListbasedOnEmpNameReverseOrder = empList.stream()
				.sorted(Comparator.comparing(Employee::getEmpName).reversed()).collect(Collectors.toList());
		
		System.out.println("sortedListbasedOnEmpNameReverseOrder : " + sortedListbasedOnEmpNameReverseOrder);
		
		/**
		 * 13) Sort the employee based on their names reverse Order 2nd Way
		 */
		
		List<Employee> sortedListbasedOnEmpNameReverseOrder2ndWay = empList.stream()
				.sorted(Comparator.comparing(Employee::getEmpName,Comparator.reverseOrder())).collect(Collectors.toList());
		System.out.println("sortedListbasedOnEmpNameReverseOrder 2ndway : " + sortedListbasedOnEmpNameReverseOrder2ndWay);

	}

}
