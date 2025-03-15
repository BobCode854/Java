package _10_method_and_constructor_reference;

/**
 *  Before coming to this class check class Method_Reference_Overview
 */
interface Interf1
{
	public void m1();
}
public class Method_Reference_overview_real_use 
{
	/**
	 *  Whatever the implementation I wanted for m1 method , its already present in m2 method .
	 */
	public static void m2() {
		 System.out.println("Hello World");
	}
	public static void main(String[] args)
	{
	    Interf i =Method_Reference_overview_real_use :: m2; 
	    i.m1();
	    /***
	     *    This method reference  used as a lambda expression implementation of m1 method.
	     *    
	     *  **)  Biggest advantage is code reusability.
	     *   **)  Compulsorily both method should have same argument type.
	     *   **) m1 and m2 method both have same argument type
	     */
	}

}
