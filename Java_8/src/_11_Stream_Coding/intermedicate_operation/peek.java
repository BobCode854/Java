package _11_Stream_Coding.intermedicate_operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class peek {
	public static void main(String[] args)
	{
		/**
		 *     **) The peek() operation allows us to inspect elements before applying the filter() operation.
		 */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Peek to see the elements before filtering
        List<Integer> filteredNumbers = numbers.stream()
                                               .peek(n -> System.out.println("Before filtering: " + n))
                                               .filter(n -> n % 2 == 0)
                                               .collect(Collectors.toList());

        System.out.println("Filtered numbers: " + filteredNumbers);
    }
}
