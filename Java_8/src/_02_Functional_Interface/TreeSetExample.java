package _02_Functional_Interface;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>(); 
		System.out.println("TreeSet With Default Natural Sorting Order");
		treeSet.add(15);treeSet.add(22);treeSet.add(13);treeSet.add(37);treeSet.add(17);treeSet.add(45);treeSet.add(17);
        System.out.println(treeSet);
        
        /***
         * Custom Sorting order
         */
        System.out.println("TreeSet With Custom Sorting Order Using Lambda Expression");
        treeSet = new TreeSet<Integer>((I1,I2)->(I1>I2)?-1:(I1<I2)?+1:0); 
        treeSet.add(15);treeSet.add(22);treeSet.add(13);treeSet.add(37);treeSet.add(17);treeSet.add(45);treeSet.add(17);
        System.out.println(treeSet);
	}

}
