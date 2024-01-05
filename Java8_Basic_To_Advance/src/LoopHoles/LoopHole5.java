package LoopHoles;

/**
 *      Topic : Multiple Inheritance
 *      -----------------------------------------
 *      Question  :  Is java support multiple Inheritance ?
 *      Answer    :  Directly No , But there is a way we will discuss here , 
 *      
 *      way1  :  If we override that method in the child class.
 *      way2 :  Refer To Line no 33 and 36
 */

interface Left {
	default void m1() {
		System.out.println("Go Left");
	}
}
interface Right {
	default void m1() {
		System.out.println("Go Right");
	}
}

public class LoopHole5 implements Left, Right {

	// we override the method , so multiple Inheritance provided method is available to this class.
	public void m1() {
		System.out.println(" GO Straight");
		
		// Their is also a way to call the Left and right interface methods.
		
		//Left class m1 method
		Left.super.m1();  // ( Left. m1 is not possible as m1 is not a static reference in Left class )
		
		// Right class m1 method
		Right.super.m1();
	}
	
	public static void main(String args[]) {
		LoopHole5 obj = new LoopHole5();
		obj.m1();
	}
}
