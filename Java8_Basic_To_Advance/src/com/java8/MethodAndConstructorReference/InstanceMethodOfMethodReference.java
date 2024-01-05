package com.java8.MethodAndConstructorReference;

public class InstanceMethodOfMethodReference {

		public  void runMethodAlternative() {
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
			
			// Alternative code as a instance method reference
			InstanceMethodOfMethodReference i1 = new InstanceMethodOfMethodReference();
			Runnable r  = i1 :: runMethodAlternative;
			Thread t = new Thread(r);
			t.start();
			
			for(int i=0;i<10;i++) {
				System.out.println("Main Thread............");
			}
		}

	}
