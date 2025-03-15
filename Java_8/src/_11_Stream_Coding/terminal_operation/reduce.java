package _11_Stream_Coding.terminal_operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class reduce {

	public static void main(String[] args)
	{
       /**
        *  **) The reduce() method combines elements in the stream into a single value based on a binary operation.
        *  **) return type @Optional
        */
		
		 List<String> stringList = new ArrayList<>();
	        stringList.add("one");
	        stringList.add("two");
	        stringList.add("three");

	Optional<String> optionalString = stringList.stream().reduce((value,combinedValue)-> combinedValue +" "+ value);
	    
	        System.out.println("reduce method result : "+optionalString.get());
	        
	        /**
	         *   *************** reduce method working ************************
	         *   Step1 : 
	         *             stringList = [ one , two,three]
	         *             value = one
	         *             combinedValue = two      // one value will go to @value and one will go to @combinedValue
	         *             result : two one
	         *             
	         *   ************************************************************
	         *   Step 2 : 
	         *          value = two one
	         *          combinedValue = three
	         *          result = three two one
	         *               
	         */
	        
	}

}
