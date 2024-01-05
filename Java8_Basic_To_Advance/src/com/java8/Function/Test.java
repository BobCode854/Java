package com.java8.Function;

import java.util.function.Function;

public class Test {

	public static void main(String args[]) {
		Function<Integer,Integer> test = i-> i*i;
		System.out.println("The multiple of 2 number is : "+test.apply(5));
	}
}
