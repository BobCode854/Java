package _11_Stream_Coding.terminal_operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class min {

	public static void main(String[] args) {
		/**
		 * **) The min() method returns the smallest element from the stream based on
		 * the specified comparator. **) return type @Optional<T>
		 * 
		 */

		List<String> stringList = new ArrayList<>();
		stringList.add("one");
		stringList.add("two");
		stringList.add("three");

		Optional<String> minString = stringList.stream().min(String::compareTo);
		System.out.println("minString : " + minString);

		List<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		
		 Optional<Integer> minInteger =  integerList.stream().min(Integer::compare);
		 System.out.println("minInteger : "+minInteger);
		 
		 int[] arr = {45,2,21,61};
		 /**
		  *    In the above scenarios everything is an stream of object that is why min method applied.
		  *    In case of primitive integer we have to first boxed into Object then only we can stream
		  */
		  Optional<Integer> minFromArray = Arrays.stream(arr).boxed().min(Integer::compare);
		  System.out.println("minFromArray : "+minFromArray);

	}

}
