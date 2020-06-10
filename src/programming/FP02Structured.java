package programming;

import java.util.List;

public class FP02Structured {

	public static void main(String[] args) {
	
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		int sum = addListStructured(numbers);
		
		System.out.println("Sum of numbers : "+sum);
		
	}

	private static int addListStructured(List<Integer> numbers) {
		int sum =0;
		for(int n : numbers) {
			sum+= n;
		}
		return sum;
	}

	
	
}
