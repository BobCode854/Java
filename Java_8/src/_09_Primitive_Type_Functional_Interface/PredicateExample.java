package _09_Primitive_Type_Functional_Interface;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
	 
		/**
		 *  Find the even number from the arr
		 */
		int[] arr =  {1,2,3,4,5,6,7,8};
		Predicate<Integer> predicate = (i)-> i%2==0; // Normal Functional Interface
		IntPredicate biPredicate = (i) ->i%2==0;   // Primitive Functional Interface
		
		System.out.println("Printing even through Predicate");
		Arrays.stream(arr).filter(number->predicate.test(number)).forEach(System.out::println);
		System.out.println("Printing even through IntPredicate");
		Arrays.stream(arr).filter(number->biPredicate.test(number)).forEach(System.out::println);
		

	}

}
