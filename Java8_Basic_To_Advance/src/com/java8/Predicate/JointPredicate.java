package com.java8.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *          Points
 *          --------------
 *          **) When 2 or more conditions we have to check in a single test 
 *                 we should use joint predicate or predicate chaining.
 *                 
 *                 We have 
 *                 --------------
 *                 And Predicate
 *                     -- p1.and(p2).test(number);
 *                 Or Predicate
 *                     -- p1.or(p2).test(number);
 *                  Not
 *                      negate()       
 *                 
 *              For Example: 
 *              ----------------
 *              Let us suppose we have 2 predicate p1 and p2. 
 *              
 *              p1  : checks whether the number even or not
 *              p2 :  checks whether the number greater than 10 or not . 
 *              
 *              If we have to check ,
 *                whether the number is even which is greater than 10 then
 *                In this case we can join p1 and p2 to get the output.
 *                
 *                p1.and(p2).test(number);
 *              
 */
public class JointPredicate {

	public static void main(String[] args) {
		Predicate<Integer> p1 = i->i%2==0;
		Predicate<Integer> p2 = i-> i>10;
		
		List<Integer> listOfInteger = Arrays.asList(2,24,32,67,99,88);
		System.out.println("Original List : "+listOfInteger);
		System.out.println("Numbers which is Greater than 10 and Even is : ");
		for(Integer i : listOfInteger) {
			if(p1.and(p2).test(i)) {
				System.out.println(i);
			}
		}
		
		// We have to print the  number which are not even : 
		
		System.out.println("Numbers which are Not Even is : ");
		for(Integer i : listOfInteger) {
			if(p1.negate().test(i)) {
				System.out.println(i);
			}
		}

	}

}
