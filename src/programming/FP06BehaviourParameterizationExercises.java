package programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP06BehaviourParameterizationExercises {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 24, 12, 15);

		List<Integer> squareNumbers = squareFunction(numbers);
		System.out.println("Square Numbers : "+squareNumbers);
		
		List<Integer> doubledNumbers = dynamicFunction(numbers, x -> 2*x );
		System.out.println("Doubled Numbers using dynamicFunction : "+doubledNumbers);
		
		List<Integer> squareNumbers2 = dynamicFunction(numbers, x -> x*x );
		System.out.println("Square Numbers using dynamicFunction : "+squareNumbers2);
		
		List<Integer> cubeNumbers = dynamicFunction(numbers, x -> x*x*x );
		System.out.println("Cube Numbers using dynamicFunction : "+cubeNumbers);
		
	}


	private static List<Integer> squareFunction(List<Integer> numbers) {
	      
		Function< Integer, Integer> squareFunction = x -> x*x;
		
		return numbers.stream().map(squareFunction).collect(Collectors.toList());
	}
	

	private static List<Integer> dynamicFunction(List<Integer> numbers, Function< Integer, Integer> function) {
		
		return numbers.stream().map(function).collect(Collectors.toList());
	}

}
