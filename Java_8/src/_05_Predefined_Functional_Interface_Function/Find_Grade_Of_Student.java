package _05_Predefined_Functional_Interface_Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Student{
	private int studentId;
	private String studentName;
	private int studentMarks;
	
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
	public int getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ "]";
	}
	public Student(int studentId, String studentName, int studentMarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}
	
	public Student() {
		super();
	}
	
}

public class Find_Grade_Of_Student {
	public static void main(String[] args)
	{
		/**
		 *   Find Grade of Each Student
		 */
		Function<Student, Character> gradeFunction = (student) -> student.getStudentMarks() >= 80 ? 'A'
				: student.getStudentMarks() >= 60 && student.getStudentMarks() < 80 ? 'B'
						: student.getStudentMarks() >= 50 && student.getStudentMarks() < 60 ? 'C'
								: student.getStudentMarks() > 40 && student.getStudentMarks() < 50 ? 'D' : 'E';

	List<Student> list = new ArrayList<Student>();
	list.add(new Student(101,"Ram",95));
	list.add(new Student(102,"Shyam",35));
	list.add(new Student(103,"Karan",75));
	list.add(new Student(104,"Vishal",85));
	list.add(new Student(105,"Chiku",65));
	list.add(new Student(106,"Mota",54));
	list.add(new Student(107,"Mahi",45));
	
	System.out.println("Name and Grade of Student");
	for(Student student : list) {
		System.out.println("Name : "+student.getStudentName() +
				" Grade :  "+gradeFunction.apply(student));
	}
	
	}

}
