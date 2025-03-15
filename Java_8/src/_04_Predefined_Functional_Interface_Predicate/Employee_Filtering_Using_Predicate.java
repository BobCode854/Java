package _04_Predefined_Functional_Interface_Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	private int empId;
	private String empName;
	private int empSalary;
	private String designation;
	
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
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
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", designation="
				+ designation + "]";
	}
	public Employee(int empId, String empName, int empSalary, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.designation = designation;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}	
}

public class Employee_Filtering_Using_Predicate {
	public static void main(String[] args) {
		Predicate<Employee> salaryGreaterThan20000 = (emp) -> emp.getEmpSalary() > 20000;
		Predicate<Employee> employeeWhoseDesignationIsCEO =
				                 (emp) -> emp.getDesignation().equalsIgnoreCase("CEO");

		ArrayList<Employee> listEmployee = new ArrayList<>();
		listEmployee.add(new Employee(1, "Karan", 21000, "CEO"));
		listEmployee.add(new Employee(2, "Mahi", 23000, "MANAGER"));
		listEmployee.add(new Employee(3, "Monika", 19000, "DEVELOPER"));
		listEmployee.add(new Employee(4, "Soumya", 18000, "CEO"));
		listEmployee.add(new Employee(5, "Amit", 22000, "MANAGER"));
		listEmployee.add(new Employee(6, "Akshat", 81000, "TESTER"));

		System.out.println("Employee having salary greater than 20000");
		for (Employee employee : listEmployee) {
			if (salaryGreaterThan20000.test(employee)) {
				System.out.println(employee);
			}
		}

		System.out.println("Employee having designation CEO");
		for (Employee employee : listEmployee) {
			if (employeeWhoseDesignationIsCEO.test(employee)) {
				System.out.println(employee);
			}
		}

	}

}
