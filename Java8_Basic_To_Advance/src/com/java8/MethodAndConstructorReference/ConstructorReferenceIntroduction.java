package com.java8.MethodAndConstructorReference;
/**
 *                              Constructor Reference
 *                        ------------------------------------------
 *                              **) When method returns an object , in that particular case we should use.
 *                              **) Syntax
 *                                   -------------
 *                                    className  :: new
 */

class Sample
{
	Sample(){
		System.out.println("Hello from sample class");
	}
}
interface Interf1
{
	Sample get();  // Here get method is returning Sample class Object
	                         //so we can use constructor  reference
}
public class ConstructorReferenceIntroduction {

	public static void main(String[] args) {
		Interf1 i = Sample :: new;
		i.get();
		
		//or 
		
		Sample s2=i.get(); 
		
		// as soon as this line will execute Sample class new
		// will be called means constructor will be called from line number 25.
		
		//or i.get() internally refers Sample class new method from line no : 25

	}

}
