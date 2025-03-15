package _02_Functional_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_With_Lambda_Expression
{
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		list.add(15);list.add(22);list.add(13);list.add(37);list.add(17);list.add(45);list.add(17);
		Collections.sort(list); // Default natural sorting order.
		Collections.sort(list,(I1,I2)->(I1>I2) ?-1:(I1<I2)?+1:0); // Custom Sorting Order with Lambda Expression
		System.out.println(list);
	}

}

