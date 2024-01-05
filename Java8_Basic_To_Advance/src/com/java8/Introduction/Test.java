package com.java8.Introduction;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test
{
	/*
	 *  He we will write Java 7 code and its parallel Java8 code with existing functional interface.
	 */
	
	public static boolean rightForVote(int age) {
		return (age>18)?true :false;
	}
	
	public static int squareIt(int number) {
		return number*number;
	}
	
	
	public static int sum(int a , int b) {
		return a+b;
	}
	
	// Its parallel Java8 code will be 
	// (a,b)->a+b;

	public static void main(String[] args)
	{
		/*
		 *  We can use Predicate functional interface when in the  situation, 
		 *  ------------------------------------------------------------------------------------------
		 *   --> return type is boolean and
		 *   --> only one parameter is passed
		 *   -->  test()  method is there which is called .
		 */
		
		Predicate<Integer> rightForVote = (age)-> age > 18 ? true : false;
		
		/*
		 *  We can use Function  functional interface when in the  situation, 
		 *  ------------------------------------------------------------------------------------------
		 *   --> return type will be there and
		 *   --> only one parameter is passed
		 *   ---> apply() method is there which is called
		 */
		
		Function <Integer,Integer> squareIt = (number) -> number * number;
		
		/*
		 *  We can use BiFunction  functional interface when in the  situation, 
		 *  ------------------------------------------------------------------------------------------
		 *   --> return type will be there and
		 *   --> 2 parameter is passed
		 *   ---> apply() method is there which is called
		 */
		
		
		BiFunction<Integer,Integer,Integer> sum = (a,b)-> a+b;
	}

}
