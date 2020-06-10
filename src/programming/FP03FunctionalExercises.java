package programming;

import java.util.Comparator;
import java.util.List;

public class FP03FunctionalExercises {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 24, 12, 15);
		
		List<String> courses =
				List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		System.out.println("Printing distinct numbers");
		distinctNumbersFunctional(numbers);
		
		System.out.println("Printing sorted numbers");
		sortedNumbersFunctional(numbers);
		
		System.out.println("Printing distinct sorted numbers in natural order");
		distinctSortedNumbersFunctional(numbers);
		
		System.out.println("Printing distinct sorted numbers in reverse order");
		distinctSortedRevNumbersFunctional(numbers);
		
		System.out.println("Printing distinct sorted courses in natural order");
		distinctSortedCoursesFunctional(courses);
		
		System.out.println("Printing distinct sorted courses in reverse order");
		distinctSortedRevCoursesFunctional(courses);
		
		System.out.println("Printing distinct sorted courses using custom order");
		distinctSortedCustomCoursesFunctional(courses);
	}

	private static void distinctNumbersFunctional(List<Integer> numbers) {
		
		numbers.stream()
		       .distinct()
		       .forEach(System.out::println);	
	}	
	
	private static void sortedNumbersFunctional(List<Integer> numbers) {
		numbers.stream()
	       .sorted()
	       .forEach(System.out::println);
		
	}
	
	private static void distinctSortedNumbersFunctional(List<Integer> numbers) {
		numbers.stream()
		   .distinct()
	       .sorted(Comparator.naturalOrder())
	       .forEach(System.out::println);
		
	}
	

	private static void distinctSortedRevNumbersFunctional(List<Integer> numbers) {
		numbers.stream()
		   .distinct()
	       .sorted(Comparator.reverseOrder())
	       .forEach(System.out::println);	
	}
	

	private static void distinctSortedRevCoursesFunctional(List<String> courses) {
		courses.stream()
		   .distinct()
	       .sorted(Comparator.reverseOrder())
	       .forEach(System.out::println);
	}


	private static void distinctSortedCoursesFunctional(List<String> courses) {
		courses.stream()
		   .distinct()
	       .sorted(Comparator.naturalOrder())
	       .forEach(System.out::println);
	}


	private static void distinctSortedCustomCoursesFunctional(List<String> courses) {
		courses.stream()
		   .distinct()
	       .sorted(Comparator.comparing(c -> c.length()))
	       .forEach(System.out::println);
		
	}

}
