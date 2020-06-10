package programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP05FunctionalInterfaces {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 24, 12, 15);

		
		
		
		Predicate<Integer> isEvenPredicate = x -> x%2==0;
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer x) {
				
				return x%2==0;
			}
			
		};
		
		Function<Integer,Integer> squareFuction = x -> x*x;
		Function<Integer,Integer> squareFuction2 = new Function<Integer,Integer>(){

			@Override
			public Integer apply(Integer x) {
				
				return x*x;
			}
			
		};
		
		Consumer<Integer> sysoutConsumer = System.out::println;
		Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
			
		};
		
		System.out.println("Using local vars..");
		numbers.stream()
		       .filter(isEvenPredicate)
		       .map(squareFuction)
		       .forEach(sysoutConsumer);
		
		System.out.println("Using Actual Functional interfaces objects");
		numbers.stream()
		       .filter(isEvenPredicate2)
		       .map(squareFuction2)
		       .forEach(sysoutConsumer2);
	}

}
