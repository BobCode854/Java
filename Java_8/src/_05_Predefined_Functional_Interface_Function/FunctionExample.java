package _05_Predefined_Functional_Interface_Function;

import java.util.function.Function;

/**
 *      ***************************** Function **********************************
 *        **) Introduced in 1.8 V
 *        **) Present in java.util.function package.
 *        **) method : apply()
 *        **) prototype signature
 *                
 *                 interface Function<T,R>
 *                 {
 *                    R apply(T t);
 *                 }
 *        
 */
public class FunctionExample {

	public static void main(String[] args) {
       /**
        *  Find length of Given String
        * 
        *  **) As Function is default given by Java people , we can directly reference lambda to it.
        */
		Function<String,Integer> function = (string) ->string.length();
		int lengthOfString = function.apply("Karan");
		System.out.println(lengthOfString);
	}

}
