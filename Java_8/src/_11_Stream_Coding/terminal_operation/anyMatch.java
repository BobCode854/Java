package _11_Stream_Coding.terminal_operation;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class anyMatch {

	public static void main(String[] args)
	{
		/**
		 *   **) anyMatch will check If any element matches in the stream or not from condition given.
		 *   **) If any element will from the stream If match return true else false.
		 */
		List<String> courseList = new ArrayList<>();
		courseList.add("Java Guides");
		courseList.add("Python Guides");
		courseList.add("C Guides");

		Stream<String> stringStream = courseList.stream();
		boolean anyMatch = stringStream.anyMatch(course -> course.startsWith("Java"));
		System.out.println("Course Found : " + anyMatch);
	}

}
