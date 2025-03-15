package _06_Predefined_Functional_Interface_Consumer;

import java.util.function.Consumer;

/**
 *  
 */
public class Consumer_Chaining {  

	public static void main(String[] args) 
	{
		Consumer<String> toUpperCase = s -> System.out.println(s.toUpperCase());
        Consumer<String> appendExclamation = s -> System.out.println(s + "!");

        Consumer<String> chainedConsumer = toUpperCase.andThen(appendExclamation);

        String input = "hello";
        chainedConsumer.accept(input);
       
	}

}
