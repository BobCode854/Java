package _10_method_and_constructor_reference;

import java.util.Arrays;
import java.util.List;

public class Reference_to_an_Instance_Method_of_an_Arbitrary_Object_of_a_Particular_Type 
{
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);
		/***
		 *  Normal Way
		 */
		numbers.stream()
		  .sorted((a, b) -> a.compareTo(b));
		
		/***
		 *    Reference_to_an_Instance_Method_of_an_Arbitrary_Object_of_a_Particular_Type  Way
		 */
		numbers.stream()
		  .sorted(Integer::compareTo);
		
		System.out.println(numbers);

	}

}
