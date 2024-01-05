package LoopHoles;

@FunctionalInterface
interface C
{
	public void m1(); // this is an abstract method
}



@FunctionalInterface
interface D extends C
{
	public void m1(); 
}
/*
 *    Its a perfectly valid code ,
 *    --------------------------------------
 *     **)   A is a functional interface with an abstract method m1.
 *     **)   B is also a functional interface as an abstract method m1.
 *     **)   Here the code will behave like m1 is an overrided method from A.
 */

