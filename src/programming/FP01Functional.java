package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 24, 12, 15);
		
		System.out.println("Printing all the numbers");
		printAllNumbersInListFunctional(numbers);
		
		System.out.println("Printing even numbers");
		printEvenNumbersInListFunctiona(numbers);
		
		
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
	
		numbers.stream().forEach(System.out::println);
	}
	
	private static void printEvenNumbersInListFunctiona(List<Integer> numbers) {
		
		numbers.stream()
		//.filter(FP01Functional::isEven) // Using Method Reference Approach
		.filter(n -> n%2==0 )  // Using Lambda expression	
		.forEach(System.out::println);
		
	}
	
	private static boolean isEven(int number) {
		return number%2==0 ;
		
	}

}
