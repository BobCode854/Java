package com.java8.MethodAndConstructorReference;


/**
 *                            --)   Method and Constructor Reference
 *                               ---------------------------------------------------
 *                               **) For Lambda Expression this is an alternative syntax.
 *                               **)  For Line no 15 to 20 I will write another utility method.
 *                               
				 *                               Only one thing to care about 
				 *                               -----------------------------------
				 *                               Method return type can be different , 
				 *                               Modifier can be different,(public , private)
				 *                               it can be either instance or a class method (static or non static)
				 *                               
				 *                               but ,
				 *                             
				 *                               1) The number of argument must be the same
				 *                               2) The type of argument must be the same
 *                               
 *                         --)    Method Reference can be done through
 *                               ------------------------------------------------------
 *                               **)  Class Reference
 *                               **) Instance Reference
 *                               
 *                               
 *                     
 *                               
 *                               
 */
public class MethodReferenceIntroduction 
{
	
	public  static void runMethodAlternative() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread....................");
		}
	}

	public static void main(String[] args) {
	
		/*
		Runnable r = ()->{
			
			for(int i=0;i<10;i++) {
				System.out.println("Child Thread");
			}
		};
		*/
		
		// Alternative code as a method reference
		Runnable r  = MethodReferenceIntroduction :: runMethodAlternative;
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread............");
		}
	}

}
