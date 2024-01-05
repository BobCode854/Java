package com.java8.MultiThreading_Using_LambdaExpression;


/*
 *  As Runnable is a Functional Interface (Only one abstract method) ,
 *   we can directly use lambda  expression to define in the main method.
 *   
 *   What we required 
 *   ---------------------------
 *    **) Runnable Interface reference
 *    **) = assignment operator  for assigning lambda expression to functional interface.
 *    ** ) Lambda expression for run method.
 */
public class UsingLambdaForThreadCreationUsingRunnableInterface2 
{
	public static void main(String args[]) {

		Runnable  r = ()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("Child  thread is runing");
			}
		};
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Parent  thread is runing");
		}
	}

}
