package programming;

import java.util.ArrayList;
import java.util.List;

public class FP12ModifyingList {

	public static void main(String[] args) {
		
		List<String> courses =
				List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		List<String> modifyableCourses = new ArrayList(courses);
		
		//courses.replaceAll(String::toUpperCase);
		
		 modifyableCourses.replaceAll(String::toUpperCase);
		 System.out.println(modifyableCourses);
		 
		 modifyableCourses.removeIf(course -> course.length()<6);
		 System.out.println(modifyableCourses);
		
	}

}
