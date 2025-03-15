package _12_interview_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *     *************** Three classes are there ***************
 *     
 *     **) StringJoiner                  --->   Use to Join only String  (Internally use StringBuilder)
 *                                                          It can be used for joining Strings making use of a delimiter, prefix, and suffix.
 *     **) String.join()                  ---->  Use to join strings, array of strings, list of string , but only with delimiter
 *                                                            not with prefix and suffix.
 *                                                           
 *     **) Collectors.joining()   -----> Method can also be used to join strings or array of strings or list of strings
 *                                                          with delimiter and it also supports prefix and suffix.
 */
public class StringJoin {

	public static void main(String[] args)
	{
		String string1 = "Karan";
		String string2 = "Sinha";
		String prefix = "[";
		String suffix = "]";
		String delimiter = ",";
		List<String> listString = new ArrayList<>();
		listString.add(string1);
		listString.add(string2);

		String[] stringForArray = { string1, string2 };

		System.out.println("***************StringJoiner For String ******************************");
		StringJoiner stringJoiner = new StringJoiner(delimiter, string1, string2);
		System.out.println(stringJoiner);

		StringJoiner stringJoiner2 = new StringJoiner(delimiter, prefix, suffix); // Correct way
		stringJoiner2.add(string1);
		stringJoiner2.add(string2);
		System.out.println(stringJoiner2);

		System.out.println("***************StringJoiner For List ******************************");
		StringJoiner stringJoinerForList = new StringJoiner(delimiter, prefix, suffix);

		for (String string : listString) {
			stringJoinerForList.add(string);
		}

		System.out.println(stringJoinerForList);

		System.out.println("*************StringJoiner  For Array ****************************");
		StringJoiner stringJoinerForArray = new StringJoiner(delimiter, prefix, suffix);
		for (String string : stringForArray) {
			stringJoinerForArray.add(string);
		}

		System.out.println(stringJoinerForArray);

		System.out.println("************************ String.Join() for String ****************************");

		String joinedString = String.join(delimiter, string1, string2);

		System.out.println(joinedString);

		System.out.println("************************ String.Join() for List ****************************");

		String joinedStringForList = String.join(delimiter, listString);
		System.out.println(joinedStringForList);

		System.out.println("************************ String.Join() for Array ****************************");

		String joinedStringForArray = String.join(delimiter, stringForArray);
		System.out.println(joinedStringForArray);
		
		System.out.println("************************ Collectors.joining for List ****************************");
        String joinedListUsingCollector =  listString.stream().collect(Collectors.joining());
        System.out.println(joinedListUsingCollector);
        
    	System.out.println("************************ Collectors.joining for Arrays ****************************");
        String joinedArrayUsingCollector =  Arrays.stream(stringForArray).collect(Collectors.joining(", ", "[", "]"));
        System.out.println(joinedArrayUsingCollector);
        
	}

}
