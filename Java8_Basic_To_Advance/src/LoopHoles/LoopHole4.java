package LoopHoles;

@FunctionalInterface
interface G
{
	public void m1(); // this is an abstract method
}


interface H extends E
{
	public void m2(); 
}
/*
 *    It is  valid code as,
 *    --------------------------------------
 *     **)   A is a functional interface with an abstract method m1.
 *     **)   B is not a  functional interface as it  does not contain @FunctionalInterface
 *              annotation so more than 1 abstract method can be allowed .
 *     **)   So other abstract method can be allowed.
 *                         
 */

