package com.java8.Predicate;

import java.util.function.Predicate;

/**
 * 
 *             Predicate(I)
 *        --------------------------------
 *       **)  Predicate in Java 8 is defined in the java. util. function package; 
 *       **)  It is an interface that contains only one abstract method. 
 *              It will be easy to guess what that method would do and return. 
 *              Since we are talking about predicates, this method would test a value 
 *              or an object with a condition and returns a boolean value.
 *              
 *        public  abstract  boolean test (T t)
 *        
 *        interface Predicate <T>
 *        {
 *        public boolean test(T t);
 *        }
 *        
 *              
 */
public class Introduction 
{
	public static void main(String args[]) 
	{
		// Checking for even number
        Predicate<Integer> p = i->i%2==0;
        System.out.println(" 5 is even or not : "+p.test(5));
        System.out.println(" 6 is even or not : "+p.test(6));
        System.out.println(" 0 is even or not : "+p.test(0));
	}
}
