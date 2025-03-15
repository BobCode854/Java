package _10_method_and_constructor_reference;

import java.util.Arrays; 
public class Static_Method_Reference {

	public static void uppercase(String s) {
		 System.out.println(new String(s).toUpperCase());
	}
	public static void main(String[] args) 
	{
		String[] arr = {"hello","how","are","you"};
		/**
		 *   *********** Static Method Reference *****************
		 *     **) Class method should be static.
		 *     **) Can be used in place of lambda expression.
		 *  
		 *  
		 */
		/**   This is normal approach   */
		Arrays.stream(arr).forEach(word->Static_Method_Reference.uppercase(word));
		
		/** This is static Method Reference approach*/
		Arrays.stream(arr).forEach(Static_Method_Reference::uppercase);
		
	}
     
}
