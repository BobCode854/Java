package _04_Predefined_Functional_Interface_Predicate;

import java.util.function.Predicate;

/**
 *     ******************** Predicate Joining **************************
 *     **) Multiple predicate join together to check multiple condition together.
 *     **) Different  methods which help to achieve this functionality
 *             
 *               --) and()          : Both predicate condition must be true , then only true.
 *               --) or()             : At least one of the condition should be true , then it will be true
 *               --) negate()     : It will check opposite logic of predicate provided.
 *              
 *     **)  P1 : Given number is greater than 10 or not.
 *     **) P2 : Given number is Even or not.
 *     
 *     **) P3 : P1.and(P2)  : This will check for join predicate condition .
 *     
 *    
 */
public class Predicate_Joining {  
	/**
	 *   
	 *   **) I have to find whether a number is greater than 10 or not and it is even together.
	 *   **) 
	 */
	public static void main(String[] args) 
	{
	   Predicate<Integer> evenNumberCheck = (number)-> number%2==0;
	   Predicate<Integer>  greaterThanTenCheck = (number)->number > 10 ;
	   
	   Predicate<Integer> joinPredicateWithAnd = evenNumberCheck.and(greaterThanTenCheck);
	   Predicate<Integer> joinPredicateWithOr = evenNumberCheck.or(greaterThanTenCheck);
	   Predicate<Integer> isNotGreaterThanTen = greaterThanTenCheck.negate();
	   
	   
	  System.out.println("and condition check  : " +joinPredicateWithAnd.test(12));
	  System.out.println("Or condition check : "+joinPredicateWithOr.test(11));
	  System.out.println("negation check : "+isNotGreaterThanTen.test(12));
	   

	}

}
