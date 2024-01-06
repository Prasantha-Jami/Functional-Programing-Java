import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FP02FunctionalExcercise04 {
	public static void main(String[] args) {
//		List<Integer>numbers=List.of(1,2,3,4,5);
//		List<Integer>evennumbers=EvenNumberList(numbers);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "MicroServices", "AMS", "Azure", "Docker",
				"Kubernates");
		List<Integer> courseslength = lengthOfCourses(courses);
		System.out.println(courseslength);
		// System.out.println(evennumbers);
		// List<Integer>doublenumbers=doubleList(numbers);
		// System.out.println(doublenumbers);
	}

	private static List<Integer> lengthOfCourses(List<String> courses) {

		return courses.stream().map(course -> course.length()).collect(Collectors.toList());
	}

	private static List<Integer> EvenNumberList(List<Integer> numbers) {
		// 1,2,3,4,5
		// 2,4
		return numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
	}

	private static List<Integer> doubleList(List<Integer> numbers) {
		// 1,2,3,4,5
		// 1,4,9,16,25
		return numbers.stream().map(number -> number * number).collect(Collectors.toList());
	}

}
