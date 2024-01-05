package com.java8.MethodAndConstructorReference;

class Student
{
	private String name;
	private int roll;
	private int marks;
	private int age;
	Student(String name,int roll, int marks, int age)
	{
		this.name = name;
		this.roll= roll;
		this.marks=marks;
		this.age=age;
	}
	public String  toString() {
		return "Name : "+name+"\nAge : "+age+"\nMarks : "+marks+"\nRoll : "+roll;
	}
}

interface Interf3
{
	Student get(String name,int roll,int marks,int age);
}

public class ConstructorReferenceExample {

	public static void main(String[] args) {
	
		// conventional way we were using till now.
		System.out.println("With Convention Way");
		Interf3 i = (name,roll,marks,age)->new Student(name,roll,marks,age);
		Student s1=i.get("Karan", 21, 55, 22);
		System.out.println(s1);
		
		//With Constructor Reference 
		System.out.println("With Constructor Reference Way");
		Interf3 i1 = Student ::new;
		Student s2=i1.get("Bob", 22, 54, 25);
		System.out.println(s2);
		
		//  i1.get  internally call Student class new method from line 38.
		

	}

}
