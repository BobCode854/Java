package com.java8.MultiThreading_Using_AnonymousInnerClass;

public class AnonumousInnerClass {

	public static void main(String[] args) {
		/*
		 *  We will use Anonymous Inner class to implement runnable interface
		 *  
		 *   Operation
		 *   --------------------
		 *     **) We are writing a class that implements Runnable Interface
		 *     **) We are providing implementation for run() method.
		 *     **)  For that implementation class we are creating an object (new Runnable()).
		 *     ** ) new Runnable() is not an object of Runnable interface but the object 
		 *             of implementation class which does not have any name thats why
		 *             called Anonymous Inner class.
		 *             
		 *             
		 *             
		 *    **) Now Runnable is a functional interface so we can use lambda expression
		 *            on top of it to reduce line of code. we will code in next java code.
		 */
		
		Runnable r = new Runnable()
		{
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child Thread is running");
				}
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Parent Thread is running");
		}

	}

}
