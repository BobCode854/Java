package _11_Stream_Coding.terminal_operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class allMatchExample {

	public static void main(String[] args)
	{
		
		/**
		 *   **) allMatch will check If all element matches in the stream or not from condition given.
		 *   **) If all the element from the stream If match then only return true else false.
		 */
		
		List<String> courseList = new ArrayList<>();
		courseList.add("Java Guides");
		courseList.add("Python Guides");
		courseList.add("C Guides");

		Stream<String> stringStream = courseList.stream();
		boolean allMatch = stringStream.allMatch(course -> course.contains("Guides"));
		System.out.println("Guide Found In each stream object : " + allMatch);

	}

}
