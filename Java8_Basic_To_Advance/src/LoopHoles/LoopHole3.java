package LoopHoles;

@FunctionalInterface
interface E
{
	public void m1(); // this is an abstract method
}



@FunctionalInterface
interface F extends E
{
	public void m2(); 
}
/*
 *    It is not a  valid code as,
 *    --------------------------------------
 *     **)   A is a functional interface with an abstract method m1.
 *     **)   B is not a  functional interface as it contains new abstract method m2().
 *     **)   Note , If F is a  child functional Interface of Parent Interface E  then F is only valid when,
 *                        -------------------------------------------------------------------------
 *                         ** ) F have no abstract method
 *                         **) F have the same  abstract method as the parent
 *                         **) F is not a functional Interface, 
 *                               means no @FunctionalInterface annotation will be there
 *                               
 *                   If any new method will be there then it will not be a functional interface.
 *                         
 */

