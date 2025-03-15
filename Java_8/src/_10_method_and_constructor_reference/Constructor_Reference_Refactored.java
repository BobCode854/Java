package _10_method_and_constructor_reference;


public class Constructor_Reference_Refactored {

	public static void main(String[] args)
	{
		Interf4 interf = Sample::new;
		Sample sample = interf.get();
		/**
		 * Referring sample class constructor implementation to interface4 get method.
		 * Get method internally refers sample class new  args constructor
		 */
		System.out.println(sample);

	}

}
