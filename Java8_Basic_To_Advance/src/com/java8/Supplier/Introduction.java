package com.java8.Supplier;

import java.util.ArrayList;
import java.util.Date;
import java.util.function.Supplier;

/**
 *                          Supplier (I)
 *             -----------------------------------
 *             **)  Present In java.util.function package.
 *             **)  It represents a function which does not take in any argument but produces a value of type T.
 *             **)  However these kind of functions don’t return any value.
 *             **)  Hence this functional interface takes in 2 generics namely as follows:
 *                          
 *                           T: denotes the type of the Result.
							  
		       **)  Method present in Supplier : get()
		       **)  The lambda expression assigned to an object of 
		               Supplier type is used to define its get() which eventually 
		               produces a value. 
		               
		       **)   Suppliers are useful when we don’t need to supply any value 
		               and obtain a result at the same time.
		               
		        
		               
		               
		               
		               Methods in Supplier Interface
		  -----------------------------------------------------------------------
		  The Function interface consists of the only 1 methods as listed 
		  which is later discussed as follows:

				 1) get()
				 
				 This method does not take in any argument but produces a value of type T
				 
				 T get()
				
			
 */
public class Introduction {

	public static void main(String[] args) {
	
		Supplier<Date> display = ()-> new Date();
		// Implement display using accept()
		System.out.println("Display Current Time : "+display.get());          
    }

}
