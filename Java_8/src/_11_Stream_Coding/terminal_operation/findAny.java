package _11_Stream_Coding.terminal_operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class findAny {

	public static void main(String[] args)
	{
		/**
		 *     **) The findAny() method returns any one element from the stream. 
		 *     **) It returns an @Optional object.
		 */
		List<String> courseList = new ArrayList<>();
		courseList.add("Java Guides");
		courseList.add("Python Guides");
		courseList.add("C Guides");
		
		Optional<String> optionalString =courseList.stream().findAny();
		System.out.println(optionalString.get());

	}

}
