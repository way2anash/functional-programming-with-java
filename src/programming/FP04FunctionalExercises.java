package programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class FP04FunctionalExercises {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 24, 12, 15);

		List<Integer> squaredNumbers = squareList(numbers);
		System.out.println("Square Numbers :"+ squaredNumbers);
		
		List<Integer> evenNumbers = evenNumberList(numbers);
		System.out.println("Even Numbers :"+ evenNumbers);
		
		List<String> courses =
		List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");

		List<Integer> courseLength = courseLength(courses);
		System.out.println("Courses"+courses);
		System.out.println("Length :"+ courseLength);
		
		System.out.println("Implementing FI in reduce..");
		implementFunctionalInterface(numbers);
	}

	private static List<Integer> squareList(List<Integer> numbers) {

		return numbers.stream()
				      .map(n -> n * n)
				      .collect(Collectors.toList());
	}
	

	private static List<Integer> evenNumberList(List<Integer> numbers) {
		
		return numbers.stream()
			      .filter(n -> n%2==0)
			      .collect(Collectors.toList());
	}


	private static List<Integer> courseLength(List<String> courses) {
		
		return courses.stream()
				      .map(c -> c.length())
				      .collect(Collectors.toList());
	}
   

	private static void implementFunctionalInterface(List<Integer> numbers) {
		
		BinaryOperator<Integer> sumAccumulator = Integer::sum;
		BinaryOperator<Integer> sumAccumulator2 = new BinaryOperator<Integer>(){

			@Override
			public Integer apply(Integer x, Integer y) {
				
				return x+y;
			}
			
		};
		
		int num = numbers.stream()
		       .reduce(0, sumAccumulator);
		System.out.println("sum : "+num);
		
		System.out.println("Sum using BinaryOperator : "+ numbers.stream().reduce(0, sumAccumulator2));
	}


}
