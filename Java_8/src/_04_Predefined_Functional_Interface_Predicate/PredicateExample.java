package _04_Predefined_Functional_Interface_Predicate;

import java.util.function.Predicate;

/**
 *      ***************************** Predicate **********************************
 *        **) Introduced in 1.8 V
 *        **) Present in java.util.function package.
 *        **) method : test()
 *        **) prototype signature
 *                
 *                 interface Predicate<T>
 *                 {
 *                    boolean test(T t);
 *                 }
 *        
 */
public class PredicateExample {

	public static void main(String[] args) {
       /**
        *  Check the given number is greater than 10 or not.
        * 
        *  **) As Predicate is default given by Java people , we can directly reference lambda to it.
        */
		Predicate<Integer> predicate = (number) -> number >10 ;
		boolean response = predicate.test(11);
		System.out.println(response);
	}

}
