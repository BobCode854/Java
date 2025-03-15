package _11_Stream_Coding.intermedicate_operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class map {

	public static void main(String[] args)
	{
		/**
		 *  ******************* On List Of String ************************************
		 */
		List<String> words = Arrays.asList("java", "stream", "api");

        // Convert each word to uppercase
        List<String> upperCaseWords = words.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());
        
        System.out.println("upperCaseWords : "+upperCaseWords);
        
        /**
         *  *********************** On Array ***************************************
         */
        int arr[] = {1,2,3,4,5};
        /**
         *  Find the mininum number from array
         */
        OptionalInt optionalInt = Arrays.stream(arr).min();
        System.out.println("Min from array : "+optionalInt.getAsInt());
        
        Optional<Integer> optionalIntegerobject = Arrays.stream(arr).boxed().min(Integer::compareTo);
        System.out.println("using conversion of primitive to object using boxed : "+optionalIntegerobject.get());
        
        int minDataUsingFindFirst = Arrays.stream(arr).sorted().findFirst().getAsInt();
        System.out.println("Using sorting and findFirst: "+minDataUsingFindFirst);
        int minDataUsingminMethod = Arrays.stream(arr).sorted().min().getAsInt();
        System.out.println("Using sorting and min method "+minDataUsingminMethod);
        System.out.println();
        
        
        
        
        /**
         *  ********************** On List *******************************************
         */
        System.out.println("**************** Find min on List **********************************");
        List<Integer> integerList = new ArrayList<>();
        integerList.add(22);
        integerList.add(35);
        integerList.add(14);
        integerList.add(37);
        integerList.add(13);
        
        /**
         *  Find the mininum number from list
         */
       Optional<Integer> optionalMin = integerList.stream().min(Integer::compareTo);
       System.out.println("Min from list using min on stream :"+optionalMin.get());
       
       /**
        *   another way using mapToInt
        *   mapToInt returns @IntStream
        *   In OptionalInt  , we will getAsInt() method
        */
      OptionalInt optionalmin = integerList.stream().mapToInt(x->x).min();
        System.out.println("Min from list using mapToInt  on stream : "+optionalmin.getAsInt());
        
        /**
         *  By Sorting
         */
      Integer min =   integerList.stream().sorted().findFirst().get();
      System.out.println("Minimum using sorting and findFirst: "+min);
      Integer mindata = integerList.stream().sorted().min(Integer::compareTo).get();
      System.out.println("Minimum using Sorting and min method : "+mindata);
	}

}
