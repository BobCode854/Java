package _11_Stream_Coding.terminal_operation;

import java.util.ArrayList;
import java.util.List;

public class count {

	public static void main(String[] args) 
	{
		/**
		 *     **) Count method will tell number of elements in the stream.
		 *     **) return type is @long
		 */
		List<String> courseList = new ArrayList<>();
		courseList.add("Java Guides");
		courseList.add("Python Guides");
		courseList.add("C Guides");
		
		long totalElements = courseList.stream().count();
		System.out.println("Total Elements : "+totalElements);
		
		
	}

}
