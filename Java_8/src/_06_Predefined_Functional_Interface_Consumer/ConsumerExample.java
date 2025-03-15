package _06_Predefined_Functional_Interface_Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *      ***************************** Consumer **********************************
 *        **) Introduced in 1.8 V
 *        **) Present in java.util.function package.
 *        **) method : accept()
 *        **) prototype signature
 *                
 *                 interface Consumer<T>
 *                 {
 *                    void accept(T t);
 *                 }
 *        
 */
public class ConsumerExample {
	public static void main(String[] args) {	    
		    List<String> cities = new ArrayList<>();
		    cities.add("Delhi");
		    cities.add("Mumbai");
		    cities.add("Goa");
		    cities.add("Pune");
		    
		    Consumer<String> printConsumer= city-> System.out.println(city);    
		    cities.forEach(printConsumer);
		    
		    List<String> names = Arrays.asList("John", "Freddy", "Samuel");
		    names.forEach(name -> System.out.println("Hello, " + name));
	}

}
