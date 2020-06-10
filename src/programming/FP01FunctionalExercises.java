package programming;

import java.util.List;

public class FP01FunctionalExercises {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 24, 12, 15);
		
		System.out.println("Exercise 1 : Printing odd numbers");
		printOddNumbersInListFunctional(numbers);
		
		List<String> courses =
				List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		System.out.println("Exercise 2 : Printing all the courses");
		printAllCourses(courses);
		
		System.out.println("Exercise 3 : Printing all the courses containing the word Spring");
		printCoursesStartingWithSpring(courses);
		
		System.out.println("Exercise 4 : Printing all the courses Whose Name has atleast 4 letters");
		printCoursesConsisting4Letters(courses);
		
		System.out.println("Exercise 5 : Printing cubes of odd numbers");
		printOddCubesNumbersInListFunctional(numbers);
		
		System.out.println("Exercise 6 : Printing length of all courses");
		printLengthOfAllCoursesFunctional(courses);
		
	}

	private static void printOddNumbersInListFunctional(List<Integer> numbers) {	
		numbers.stream()
		.filter(n -> n%2!=0 )  
		.forEach(System.out::println);
		
	}
	

	private static void printAllCourses(List<String> courses) {
		courses.stream()
		.forEach(System.out::println);
		
	}

	private static void printCoursesStartingWithSpring(List<String> courses) {
		courses.stream()
		.filter(course  -> course.equals("Spring"))
		.forEach(System.out::println);
		
	}
	
	private static void printCoursesConsisting4Letters(List<String> courses) {
		courses.stream()
		.filter(course -> course.length() >= 4 )
		.forEach(System.out::println);	
		
	}	

	private static void printOddCubesNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
		.filter(n -> n%2!=0 )  
		.map(n -> n*n*n)
		.forEach(System.out::println);
		
	}

	private static void printLengthOfAllCoursesFunctional(List<String> courses) {
		courses.stream()
		.map(course -> course +" "+ course.length())
		.forEach(System.out::println);
		
	}
	
}
