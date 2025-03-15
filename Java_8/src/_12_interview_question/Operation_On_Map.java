package _12_interview_question;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Operation_On_Map {

	public static void main(String[] args) {
		Map<String, Integer> nameToSalMapping = new HashMap<>();
		nameToSalMapping.put("anil", 1000);
		nameToSalMapping.put("brijesh", 5500);
		nameToSalMapping.put("karan", 100000);
		nameToSalMapping.put("amir", 4000);
		nameToSalMapping.put("deepanshu", 6600);
		nameToSalMapping.put("ankit", 55000);
		nameToSalMapping.put("daniel", 1700);
		nameToSalMapping.put("james", 4400);

 System.out.println("*********************************** Sorting Based On Key *******************************************");
		/**
		 * 1) Sort the Map Based on Ascending order of Key
		 */
		List<Entry<String, Integer>> sortingbasedOnKeyAsc = nameToSalMapping.entrySet().stream()
				.sorted(Comparator.comparing(Map.Entry::getKey)).collect(Collectors.toList());

		System.out.println("sortingbasedOnKeyAsc : " + sortingbasedOnKeyAsc);

		/**
		 * 2) Sort the Map Based on Ascending order of Key 2 way
		 */
		List<Entry<String, Integer>> sortingbasedOnKeyAsc2way = nameToSalMapping.entrySet().stream()
				.sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());

		System.out.println("sortingbasedOnKeyAsc 2 way : " + sortingbasedOnKeyAsc2way);

		/**
		 * 3) Sort the Map Based on Descending order of Key
		 */
		List<Entry<String, Integer>> sortingbasedOnKeyDesc = nameToSalMapping.entrySet().stream()
				.sorted(Comparator.comparing(Map.Entry::getKey, Comparator.reverseOrder()))
				.collect(Collectors.toList());

		System.out.println("sortingbasedOnKeyDesc : " + sortingbasedOnKeyDesc);

		/**
		 * 4) Sort the Map Based on Descending order of Key 2nd Way
		 */
		List<Entry<String, Integer>> sortingbasedOnKeyDesc2Way = nameToSalMapping.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).collect(Collectors.toList());
		System.out.println("sortingbasedOnKeyDesc2Way : " + sortingbasedOnKeyDesc2Way);

		/**
		 * 5) Sort the Map Based on Descending order of Key 3rd Way
		 */
		List<Entry<String, Integer>> sortingbasedOnKeyDesc3Way = nameToSalMapping.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList());
		System.out.println("sortingbasedOnKeyDesc3Way : " + sortingbasedOnKeyDesc3Way);
		
		/**
		 * 6) Sort the Map Based on Descending order of Key 4th Way
		 *
		 */
		Map<String, Integer> sortingbasedOnDescendingOrderOfKey4thWay = new TreeMap<>(Comparator.reverseOrder());
		sortingbasedOnDescendingOrderOfKey4thWay.putAll(nameToSalMapping);
		System.out.println("sortingbasedOnDescendingOrderOfKey4thWay : " + sortingbasedOnDescendingOrderOfKey4thWay);
		
		System.out.println();
		System.out.println("*********************************** Sorting Based On Value *******************************************");
		
		/**
		 * 7) Sort the map based on Ascending order of value.
		 */
		List<Entry<String, Integer>> sortingBasedOnValueAsc = nameToSalMapping.entrySet().stream()
				.sorted(Comparator.comparing(Map.Entry::getValue)).collect(Collectors.toList());

		System.out.println("sortingBasedOnValueAsc : " + sortingBasedOnValueAsc);

		/**
		 * 8) Sort the map based on Ascending order of value 2nd Way.
		 */
		List<Entry<String, Integer>> sortingBasedOnValueAsc2ndWay = nameToSalMapping.entrySet().stream()
				.sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
		
		System.out.println("sortingBasedOnValueAsc2ndWay : "+sortingBasedOnValueAsc2ndWay);
		
		/**
		 * 9) Sort the map based on Descending order of value.
		 */
		List<Entry<String, Integer>> sortingBasedOnValueDesc = nameToSalMapping.entrySet().stream()
				.sorted(Comparator.comparing(Map.Entry::getValue,Comparator.reverseOrder())).collect(Collectors.toList());

		System.out.println("sortingBasedOnValueDesc : " + sortingBasedOnValueDesc);

		/**
		 * 8) Sort the map based on Descending order of value 2nd Way.
		 */
		List<Entry<String, Integer>> sortingBasedOnValueDesc2ndWay = nameToSalMapping.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList());
		
		System.out.println("sortingBasedOnValueDesc2ndWay : "+sortingBasedOnValueDesc2ndWay);
		
	}

}
