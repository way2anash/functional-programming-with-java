package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
	
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 24, 12, 15);
		
		System.out.println("Printing all the numbers");
		printAllNumbersInListStructured(numbers);
		
		System.out.println("Printing even numbers");
		printEvenNumbersInListStructured(numbers);
		
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {

		for (int n : numbers) {
			System.out.println(n);
		}
	}

	private static void printEvenNumbersInListStructured(List<Integer> numbers) {

		for (int n : numbers) {
			
			if(n%2==0) {
				System.out.println(n);
			}
			
		}
	}
}
