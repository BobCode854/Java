package _02_Functional_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *                        Functional Interface
 *      ******************************************************
 *      **) An Interface that contain single abstract method is called Functional Interface.
 *      **) @FunctionalInterface is also an annotation to denote an interface as Functional Interface.
 *      **) It is also called SAM (Single Abstract Method)
 *      
 *      
 *    
 */
/**
 *  Custom Sorting Order (Descending Order)
 */
class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 < o2)
			return +1;
		else if (o1 > o2)
			return -1;
		return 0;
	}	}
public class Sorting_Without_Lambda_Expression
{
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		list.add(15);list.add(22);list.add(13);list.add(37);list.add(17);list.add(45);list.add(17);
		Collections.sort(list); // Default natural sorting order.
		Collections.sort(list, new MyComparator()); // Custom Sorting Order
		System.out.println(list);
	}

}
