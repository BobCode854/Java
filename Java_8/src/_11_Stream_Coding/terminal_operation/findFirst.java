package _11_Stream_Coding.terminal_operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class findFirst {

	public static void main(String[] args) {
		/**
		 *     **) The findFirst() method returns any first element from the stream. 
		 *     **) It returns an @Optional object.
		 */
		List<String> courseList = new ArrayList<>();
		courseList.add("Java Guides");
		courseList.add("Python Guides");
		courseList.add("C Guides");
		
		Optional<String> optionalString =courseList.stream().findFirst();
		System.out.println(optionalString.get());

	}

}
