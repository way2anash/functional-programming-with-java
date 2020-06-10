package programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course {

	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return "FP08CustomClass [" + name + ":" + category + ":" + reviewScore
				+ ":" + noOfStudents + "]";
	}

}

public class FP08CustomClass {

	public static void main(String[] args) {

		List<Course> courses = List.of(
				new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000),
				new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), 
				new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), 
				new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000));
		
		Predicate<Course> reviewScoreGT95Predicate = 
				course -> course.getReviewScore() > 95;
				
		Predicate<Course> reviewScoreGT90Predicate = 
						course -> course.getReviewScore() > 90;
						
		Predicate<Course> reviewScoreLT90Predicate = 
								course -> course.getReviewScore() < 90;
		
		System.out.println(courses.stream().allMatch(reviewScoreGT95Predicate));
		
		System.out.println(courses.stream().noneMatch(reviewScoreGT95Predicate));
		
		System.out.println(courses.stream().noneMatch(reviewScoreLT90Predicate));
		
		System.out.println(courses.stream().anyMatch(reviewScoreLT90Predicate));
		
		Comparator<Course> comparingByNoOfStudentsAscending
		           = Comparator.comparing(Course::getNoOfStudents);
		
		System.out.println(courses.stream()
			       .sorted(comparingByNoOfStudentsAscending)
			       .collect(Collectors.toList()));
		
		Comparator<Course> comparingByNoOfStudentsDescending 
		           = Comparator.comparing(Course::getNoOfStudents).reversed();
		
		System.out.println(courses.stream()
		       .sorted(comparingByNoOfStudentsDescending)
		       .collect(Collectors.toList()));
		
		Comparator<Course> comparingByNoOfStudentsAndNoOfReviews 
                  = Comparator.comparing(Course::getNoOfStudents)
                              .thenComparing(Course::getReviewScore)
                              .reversed();
		
		System.out.println(courses.stream()
			       .sorted(comparingByNoOfStudentsAndNoOfReviews)
			       .collect(Collectors.toList()));
		
		//limit
		System.out.println(courses.stream()
			       .sorted(comparingByNoOfStudentsAndNoOfReviews)
			       .limit(5)
			       .collect(Collectors.toList()));
		
		//skip
		System.out.println(courses.stream()
			       .sorted(comparingByNoOfStudentsAndNoOfReviews)
			       .skip(3)
			       .limit(5)
			       .collect(Collectors.toList()));
		
		System.out.println(courses);
		
		//takeWhile
		System.out.println(courses.stream()
		       .takeWhile(course -> course.getReviewScore()>=95)
		       .collect(Collectors.toList()));
		
		//dropWhile
		System.out.println(courses.stream()
			       .dropWhile(course -> course.getReviewScore()>=95)
			       .collect(Collectors.toList()));
		
		System.out.println(courses.stream()
				           .max(comparingByNoOfStudentsAndNoOfReviews));
		
		System.out.println(courses.stream()
		           .min(comparingByNoOfStudentsAndNoOfReviews));
		
		System.out.println(courses.stream()
				   .filter(reviewScoreLT90Predicate)
		           .min(comparingByNoOfStudentsAndNoOfReviews)
		           .orElse(new Course("Kubernetes", "Cloud", 91, 20000)));
		
		System.out.println(courses.stream()
				   .filter(reviewScoreLT90Predicate)
		           .findFirst());
		
		System.out.println(courses.stream()
				   .filter(reviewScoreGT95Predicate)
		           .findFirst());
		
		System.out.println(courses.stream()
				   .filter(reviewScoreGT95Predicate)
		           .findAny());
		
		System.out.println(courses.stream()
				   .filter(reviewScoreGT95Predicate)
				   .mapToInt(Course::getNoOfStudents)
				   .sum());
		
		System.out.println(courses.stream()
				   .filter(reviewScoreGT95Predicate)
				   .mapToInt(Course::getNoOfStudents)
				   .average());
		
		System.out.println(courses.stream()
				   .filter(reviewScoreGT95Predicate)
				   .mapToInt(Course::getNoOfStudents)
				   .count());
		
		System.out.println(courses.stream()
				   .filter(reviewScoreGT95Predicate)
				   .mapToInt(Course::getNoOfStudents)
				   .max());
		
		System.out.println(courses.stream()
				   .collect(Collectors.groupingBy(Course::getCategory)));
		
		System.out.println(courses.stream()
				   .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));
		
		System.out.println(courses.stream()
				   .collect(Collectors.groupingBy(Course::getCategory,
						   Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));
		
		System.out.println(courses.stream()
				   .collect(Collectors.groupingBy(Course::getCategory, 
						   Collectors.mapping(Course::getName, Collectors.toList()))));
	}

}










