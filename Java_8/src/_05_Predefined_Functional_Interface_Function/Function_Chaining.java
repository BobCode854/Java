package _05_Predefined_Functional_Interface_Function;

import java.util.function.Function;

/**
 *  
 */
public class Function_Chaining {  

	public static void main(String[] args) 
	{
	   Function<String,Integer> lengthOfString = (string) -> string.length();
	   Function<Integer,Integer> squareOfNumber = (number) -> number* number;
	   
	   System.out.println("Length of the string Anamika : ");
	   System.out.println(lengthOfString.apply("Anamika"));
	   
	   System.out.println("Square of 4 is : ");
       System.out.println(squareOfNumber.apply(4));
       
       /**
        *  Chaining both condition together
        */
       System.out.println("Square of a string length of Anamika");
       System.out.println(lengthOfString.andThen(squareOfNumber).apply("Anamika"));
       
	}

}
