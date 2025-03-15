package _11_Stream_Coding.terminal_operation;

import java.util.ArrayList;
import java.util.List;

public class toArray {

	public static void main(String[] args)
	{
	/**
	 *      **) The toArray() method converts the elements of the stream into an array.	
	 *      **) return @Object[]
	 */
		
		List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        
       Object[] array = stringList.stream().toArray();
       for(Object string : array) {
    	   System.out.println(string);
       }

	}

}
