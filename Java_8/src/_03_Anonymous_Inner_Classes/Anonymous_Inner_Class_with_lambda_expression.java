package _03_Anonymous_Inner_Classes;


/**
 *     Runnable r = new Runnable()
 *     {
 *         public void run(){
 *           ..... method body
 *           }
 *     }
 *     
 *     
 *     Explanation
 *     ============
 *    **)  I am writing a class  that implements Runnable Interface( Runnable r) 
 *           for that implemented class I am creating a object (new Runnable()).
 *           
 *    **) So the Object is not of Runnable interface but its an object of the class which implements
 *           Runnable Interface .
 *           
 *     **) What is the name of that class ? No name that is why it is called Anonymous Inner class.
 *     
 */

/**
 *  Anonymous class  and method code execution with Lambda Expression.
 *  
 *   **) Run method removed(abstract method)
 *   **) Give Lambda sign
 */
public class Anonymous_Inner_Class_with_lambda_expression 
{
	public static void main(String[] args) {
	
		Runnable r = ()-> {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child Thread Execution");
				}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}

	}

}
