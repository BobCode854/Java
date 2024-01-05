package LoopHoles;

@FunctionalInterface
interface A
{
	public void m1(); // this is an abstract method
}



@FunctionalInterface
interface B extends A
{
	
}
/*
 *    Its a perfectly valid code ,
 *    --------------------------------------
 *      A is a functional interface with an abstract method m1.
 *      B is also a functional interface as extends will bring method A.
 */

