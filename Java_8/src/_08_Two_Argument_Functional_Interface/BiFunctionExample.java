package _08_Two_Argument_Functional_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExample {

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
	    
	    BiFunction<Integer,Boolean,Boolean> ageAndVoterIdCheckPredicate = (age, voterIdCheck) -> (age > 18 && voterIdCheck ==true) ? true : false;
	    System.out.println("Student Name who is eligible for vote");
	    listStudent.forEach(student->{
	    	if(ageAndVoterIdCheckPredicate.apply(student.getAge(), student.isVoterId())){
	    		 System.out.println("Name : "+student.getStudentName() + ", age : "+student.getAge());
	    	}
	    });
	}

}
