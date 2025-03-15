package _11_Stream_Coding.intermedicate_operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class skip
{
	 public static void main(String[] args)
	 {
		 /**
		  *      **) The skip() operation discards the first 5 elements, returning a stream of the remaining elements.
		  */
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        // Skip the first 5 elements
	        List<Integer> skippedNumbers = numbers.stream()
	                                              .skip(5)
	                                              .collect(Collectors.toList());

	        System.out.println(skippedNumbers);
	    }
}
