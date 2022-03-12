package org.java.core;

public class PrimeNumber {

	public PrimeNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Finding Prime Number In between 1-100
   int count=0; //this will be increased when number divisible by 0 
		for (int number = 2; number <= 100; number++)
		{
			for (int i = 2; i < number; i++) 
			{
                   if(number%i==0) {
                	   count=count+1;
                	   break;
                   }
			}
			if(count==1)
				System.out.println(number+" is not prime");
			else
				System.out.println(number+" is prime");
			count=0;
		}

	}

}
