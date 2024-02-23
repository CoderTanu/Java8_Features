package CoderTanu_Java8_PredicateDemo;

import java.util.function.Function;

public class FunctionDemo {
	
	
	public static void main(String args[]) {
	Function<Integer, Integer> square= i -> i*i ;
	System.out.println("The square is" + square.apply(8));
	}

}
