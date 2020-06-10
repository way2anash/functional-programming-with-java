package programming;

import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		int sum = addListFunctional(numbers);
		System.out.println("Sum of numbers : " + sum);

		int val = squareNumbersSum(numbers);
		System.out.println("Sum of squares of numbers : " + val);

		int val2 = sumOfOddNumbers(numbers);
		System.out.println("Sum of odd numbers : " + val2);
	}

	private static int sumOfOddNumbers(List<Integer> numbers) {

		return numbers.stream().filter(n -> n % 2 != 0).reduce(0, Integer::sum);

	}

//	private static int sum(int a, int b) {
//		
//		return a+b;
//	}

	private static int addListFunctional(List<Integer> numbers) {

		return numbers.stream()
				// .reduce(0, FP02Functional::sum); // Using Method Reference
				// .reduce(0, (x,y) -> x+y); // Using lambda expression
				.reduce(0, Integer::sum);

	}

	private static int squareNumbersSum(List<Integer> numbers) {

		return numbers.stream().map(x -> x * x).reduce(0, Integer::sum);

	}

}
