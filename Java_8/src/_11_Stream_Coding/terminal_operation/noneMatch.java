package _11_Stream_Coding.terminal_operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class noneMatch {

	public static void main(String[] args) 
	{
		
		/**
		 *   **) noneMatch will check all the element in the stream must not match  from the given condition .
		 *   **) If any element  from the stream will match ,  return false else true.
		 */
		
		List<String> courseList = new ArrayList<>();
		courseList.add("Java Guides");
		courseList.add("Python Guides");
		courseList.add("C Guides");

		boolean noneMatch = courseList.stream().noneMatch(course -> course.startsWith("Java")); // false
		boolean noneMatch2 = courseList.stream().noneMatch(course -> course.startsWith("C++")); //true
		System.out.println("None Match Found For Java: " + noneMatch);
		System.out.println("None Match Found  For C++: " + noneMatch2);

	}

}
