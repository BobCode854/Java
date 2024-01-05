package com.java8.MultiThreading_Using_AnonymousInnerClass;

public class AnonymousInnerClass_VS_LambdaExpression {

	/**
	 *      Which Concept  is more Powerful
	 *      ---------------------------------------------------
	 *      **)  Anonymous Inner class is more powerful
	 *      **) Lambda Expression we can only use when an Interface will be a FunctionalInterface. 
	 *      **) But If multiple abstract method will be present in an interface , 
	 *             we cannot use Lambda Expression , But We can use anonymous Inner class .
	 *             
	 *             
	 *            class                                                 Anonymous_Inner_class(possible or not)                                   LambdaExpression(possible or not)
	 *            ----------                                           -------------------------------------------------                                 ----------------------------------------------
	 *            FunctionalInterface                                       Possible                                                                                Possible
	 *            (1 abstract method)
	 *            
	 *            Other Interface
	 *            (More than one
	 *             abstract method)                                          Possible                                                                                Not Possible
	 */
}
