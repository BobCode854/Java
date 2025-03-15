package _10_method_and_constructor_reference;

interface Interf4
{
	public Sample get();
}
class Sample
{
	Sample()
	{
		System.out.println("Hello from  Sample Constructor");
	}
}
public class Constructor_Reference {

	public static void main(String[] args)
	{
	  Interf4 interf = ()->{
		      Sample s= new Sample();
		      return s;
	  };
	 Sample sample = interf.get();
	 System.out.println(sample);

	}

}
