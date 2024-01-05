package com.java8.MultiThreading_Using_LambdaExpression;



class MyRunnable implements Runnable{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child thread is runing");
		}
	}
}

/*
 *  MyRunnable is an extra class we are using  to define the run method for Runnable Interface.
 *  As it is a Functional Interface (Only one abstract method) , we can directly use lambda 
 *   expression to define in the main method.
 *   
 *   What we required 
 *   ---------------------------
 *    **) Runnable Interface reference
 *    **) = assignment operator  for assigning lambda expression to functional interface.
 *    ** ) Lambda expression for run method.
 */
public class NormalWayToCreateThreadUsingRunnableInterface 
{
	public static void main(String args[]) {

		// with normal approach
		MyRunnable myRunnable = new MyRunnable();
		Thread t = new Thread(myRunnable);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Parent  thread is runing");
		}
	}

}
