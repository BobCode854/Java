package com.java8.Function;

import java.util.function.Function;

/**
 *                          Function (I)
 *             -----------------------------------
 *             **)  Present In java.util.function package.
 *             **)  It represents a function which takes in one argument and produces a result
 *             **)  The Result can be of any type.
 *             **)  Hence this functional interface takes in 2 generics namely as follows:
 *                          
 *                           T: denotes the type of the input argument
							  R: denotes the return type of the function
							  
		       ** ) Method present in Function : apply()
		       **)  The lambda expression assigned to an object of Function type 
		               is used to define its apply() which eventually applies the given
		               function on the argument.
		               
		               
		               
		               Methods in Function Interface
		  -----------------------------------------------------------------------
		  The Function interface consists of the following 4 methods as listed 
		  which are later discussed as follows:

				 1) apply()
				 2) andThen()  -> f1.andThen(f2).apply(data); // first f1 and then f2 will execute
				 3) compose()   -> f1.compose(f2).apply(data); // first f2 and then f1 will execute
 				 4) identity()
 				 
 			Note : 	 There is slite difference between andThen method and compose() method 
 				 
 				andThen  : first function will execute first and then second function will execute
 				compose : second function will execute first then first function will execute
 				
 				
 		    ** ) When Input and Output type is same in case of function, then we can use
 		             UnaryOperator , BinaryOperator as functional Interface.
 		             
 		              --> Unary Operator is child of Function.
 		              
 		             
 		             Function<Integer,Integer> f = i->i*i; //not recommended
 		             UnaryOperator<Integer> f = i->i*i;   // recommended
 		             
 		             Similarly , When Input and Output is always INTEGER type
 		                 Interface :  IntUnaryOperator f
 		                 method :     applyAsInt(int)            // best choice
 		                  
 		             Similarly , When Input and Output is always Long type
 		                   Interface :  LongUnaryOperator f
 		                   method :     applyAsLong(Long)   //best choice
 		                   
 		      
 		     BiFunction
 		     ------------------------------          
 		    **)  BiFunction : When we have 2 input type to perform operation . 
 		    **)  BiFunction <T,T,T>
 		    **) method : apply()
 		    
 		     BinaryOperator
 		     ------------------------------------
 		    **) BinaryOperator  :  It is a child of BiFunction.
 		    **) When both operators is of same type and produces result of same type.
 		    **) method : apply()
 		    **) BinaryOperator<T> 
 		    
 		    Primitive Type of Binary Operator
 		    -------------------------------------------
 		    **) IntBinaryOperator :     When input and return type is integer.
 		    **) Method : applyAsInt()
 		    
 		    **) LongBinaryOperator :   When input and return type is long.
 		    **) Method :                           applyAsLong()
 		    
 		       **) DoubleBinaryOperator :   When input and return type is double.
 		       **) Method :                           applyAsDouble()
 		   
 		                                 
 		     
 */
public class Introduction {

	public static void main(String[] args) {
	
		// Function which takes in a number
        // and returns half of it
        Function<Integer, Double> half = a -> a / 2.0;
 
        // Applying the function to get the result
        System.out.println(half.apply(10));
        
        
        // Function chaining
        
         Function<Integer,Integer> f1 = i -> 2*i;
         Function <Integer,Integer> f2 = i -> i*i*i;
         
         System.out.println("Result of andThen method : "+f1.andThen(f2).apply(2));
         System.out.println("Result of compose method : "+f1.compose(f2).apply(2));
}

}
