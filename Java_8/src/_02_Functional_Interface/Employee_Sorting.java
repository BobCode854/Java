package _02_Functional_Interface;

import java.util.ArrayList;
import java.util.Collections;

class Employee
{
	private int empno;
	private String ename;
	public Employee(int empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
	}
	
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + "]";
	}
	
}
public class Employee_Sorting {
	public static void main(String[] args)
	{
	 ArrayList<Employee> listEmployee = new ArrayList<Employee>();	
	 listEmployee.add(new Employee(510,"Karan"));
	 listEmployee.add(new Employee(435,"Karan"));
	 listEmployee.add(new Employee(720,"Karan"));
	 listEmployee.add(new Employee(414,"Karan"));
	 listEmployee.add(new Employee(329,"Karan"));
	 listEmployee.add(new Employee(580,"Karan"));
    
	 System.out.println(listEmployee);
	 
	 /**  Sort Based on EmpId  using Lambda Expression */
	 Collections.sort( listEmployee,(e1,e2)->
	                        (e1.getEmpno() > e2.getEmpno()) ? +1 
	                        : (e1.getEmpno() <e2.getEmpno()) ?-1 : 0
	                        );
	 
	 System.out.println("After Sorting based on empId ascending order : ");
	 System.out.println(listEmployee);
	}

}
