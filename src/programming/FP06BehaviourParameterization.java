package programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP06BehaviourParameterization {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 24, 12, 15);

		System.out.println("List of Even numbers.....");
		//Predicate<? super Integer> evenPredicate = n -> n%2==0;
		filterAndPrint(numbers, n -> n%2==0);
		
		System.out.println("List of Odd numbers.....");
		//Predicate<? super Integer> oddPredicate = n -> n%2!=0;
		filterAndPrint(numbers, n -> n%2 !=0);
		
		System.out.println("List of numbers divisible by 3.....");
		//Predicate<? super Integer> oddPredicate = n -> n%3==0;
		filterAndPrint(numbers, n -> n%3==0);
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers.stream()
	       .filter(predicate)
	       .forEach(System.out::println);
	}

}
