package _11_Stream_Coding.intermedicate_operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class limit 
{
	 public static void main(String[] args) 
	 {
		 /**
		  * The limit(n) operation restricts the stream to only the first n elements.
		  */
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        // Limit the stream to the first 3 elements
	        List<Integer> limitedNumbers = numbers.stream()
	                                              .limit(3)
	                                              .collect(Collectors.toList());

	        System.out.println(limitedNumbers);
	    }
}
