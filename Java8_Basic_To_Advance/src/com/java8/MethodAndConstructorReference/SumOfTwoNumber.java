package com.java8.MethodAndConstructorReference;


/**
 *        When to go with method reference and when to use Lambda expression
 *        -----------------------------------------------------------------------------------------------
 *        
 *        ** ) If Implementation is already available then better to go with Method Reference.
 *               If not then Lambda expression.
 */
interface Interf
{
	public void add(int a, int b);
}
public class SumOfTwoNumber
{
	public static void sum(int a , int b) {
		System.out.println("The sum  is : "+(a+b));
	}
	public static void main(String args[]) {
		
		Interf i = (a,b)->System.out.println("The Sum : "+(a+b));
		i.add(3,4);
		
		Interf i1 = SumOfTwoNumber::sum; // Method Reference way
		i1.add(5, 6);
		
	}

}
