package _08_Two_Argument_Functional_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

class Student
{
	int studentId;
	String studentName;
	boolean voterId;
	int age;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public boolean isVoterId() {
		return voterId;
	}
	public void setVoterId(boolean voterId) {
		this.voterId = voterId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", voterId=" + voterId + ", age="
				+ age + "]";
	}
	public Student(int studentId, String studentName, boolean voterId, int age) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.voterId = voterId;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
public class BiPredicateExample
{
	public static void main(String[] args)
	{
		/**
		 *  I wanted to find a student whose age is greater than 18 and have voter id can vote
		 */
	    List<Student> listStudent = new ArrayList<>();
	    listStudent.add(new Student(101,"Karan",true,29));
	    listStudent.add(new Student(102,"Rahul",true,27));
	    listStudent.add(new Student(103,"Mahi",true,29));
	    listStudent.add(new Student(104,"Anurag",false,29));
	    listStudent.add(new Student(105,"Amit",true,29));
	    listStudent.add(new Student(106,"Nihar",false,16));
	    listStudent.add(new Student(107,"Akshat",true,17));
	    listStudent.add(new Student(108,"Elango",false,39));
	    
	    BiPredicate<Integer,Boolean> ageAndVoterIdCheckPredicate =(age, voterIdCheck) -> age > 18 && voterIdCheck ==true;
	    System.out.println("Student Name who is eligible for vote");
	    listStudent.forEach(student->{
	    	if(ageAndVoterIdCheckPredicate.test(student.getAge(), student.isVoterId())){
	    		 System.out.println("Name : "+student.getStudentName() + ", age : "+student.getAge());
	    	}
	    });
	}

}
