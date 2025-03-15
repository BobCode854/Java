package _11_Stream_Coding.terminal_operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class max {

	public static void main(String[] args) {
		/**
		 * **) The max() method returns the smallest element from the stream based on
		 * the specified comparator. **) return type @Optional<T>
		 * 
		 */

		List<String> stringList = new ArrayList<>();
		stringList.add("one");
		stringList.add("two");
		stringList.add("three");

		Optional<String> maxString = stringList.stream().max(String::compareTo);
		System.out.println("maxString : " + maxString);

		List<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		
		 Optional<Integer> maxInteger =  integerList.stream().max(Integer::compare);
		 System.out.println("maxInteger : "+maxInteger);
		 
		 int[] arr = {45,2,21,61};
		 /**
		  *    In the above scenarios everything is an stream of object that is why max method applied.
		  *    In case of primitive integer we have to first boxed into Object then only we can stream
		  */
		  Optional<Integer> maxFromArray = Arrays.stream(arr).boxed().max(Integer::compare);
		  System.out.println("maxFromArray : "+maxFromArray);

	}

}
