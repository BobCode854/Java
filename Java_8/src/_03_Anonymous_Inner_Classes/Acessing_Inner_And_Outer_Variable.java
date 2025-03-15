package _03_Anonymous_Inner_Classes;

interface Interf
{
	public void m1();
}
public class Acessing_Inner_And_Outer_Variable {
    int x=10;
	public void m2() {
		int y = 20;
		Interf interf = () -> {
           
                System.out.println("x : "+x);
                System.out.println("y : "+y);
                x=888;
           //    y=11; // we can't change local variable which are referenced inside the lambda expression,          
		};
		interf.m1();
	}
	public static void main(String[] args) {
		Acessing_Inner_And_Outer_Variable var = new Acessing_Inner_And_Outer_Variable();
		var.m2();
	}

}
