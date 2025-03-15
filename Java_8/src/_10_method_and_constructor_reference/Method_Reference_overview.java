package _10_method_and_constructor_reference;

interface Interf
{
	public void m1();
}
public class Method_Reference_overview 
{
	public static void main(String[] args)
	{
	    Interf i =()-> System.out.println("Hello World"); // This is the Lambda expression implementation for
	    i.m1();                                                                        // m1 method
    
	}

}
