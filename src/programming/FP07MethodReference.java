package programming;

import java.util.List;
import java.util.function.Supplier;

public class FP07MethodReference {

	public static void main(String[] args) {
		
		List<String> courses =
				List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		System.out.println("Using system class......................");
		courses.stream()
		       .map(str -> str.toUpperCase())
		       .forEach(System.out::println);
		
		System.out.println("Using Custom class.......................");
		courses.stream()
		       .map(str -> str.toUpperCase())
		       .forEach(FP07MethodReference::print);
		
		System.out.println("Using Method Reference in map function.......................");
		courses.stream()
		       .map(String::toUpperCase)
		       .forEach(FP07MethodReference::print);
		
		System.out.println("Using Method Reference for constructors.......................");
		Supplier<String> supplier = String::new;
		System.out.println(supplier.get());
	}
	
	public static void print(String str) {
		
		System.out.println(str);
	}

}
