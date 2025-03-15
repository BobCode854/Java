package _07_Predefined_Functional_Interface_Supplier;

import java.util.function.Supplier;

/**
 *      ***************************** Supplier **********************************
 *        **) Introduced in 1.8 V
 *        **) Present in java.util.function package.
 *        **) method : get()
 *        **) prototype signature
 *                
 *                 interface Supplier<R>
 *                 {
 *                    R get();
 *                 }
 *        
 */
public class SupplierExample {
		 public static void main(String[] args) {
		        // ✅ Define a Supplier that returns a constant value
		        Supplier<String> constantSupplier = () -> "Hello World!";

		        String result = constantSupplier.get();
		        System.out.println(result); // Output: Hello World!
		    }
	

}
