import java.util.List;

public class FP01FunctionalExcerise01 {
	public static void main(String[] args) {
		List<String> courses = List.of("Spring","Spring Boot","API", "MicroServices","AMS","Azure","Docker","Kubernates");
		printAllCourseNames(courses);
	}
		
//	printSquareOfNumbers(List.of(2,4,6,7,8,9));
//	printSquareOfEvenNumbers(List.of(3,4,5,6,8,9,10));
//	printSquareOfOddNumbers(List.of(3,4,5,6,8,9,10));
	

//	private static void printSquareOfOddNumbers(List<Integer> numbers) {
//		
//		numbers.stream()
//		.filter(number->number%2==0)
//		.map(num->num*num*num)
//		.forEach(System.out::println);
//	}
//
//	private static void printSquareOfEvenNumbers(List<Integer> numbers) {
//		numbers.stream()
//		.filter(number->number%2==0)
//		.map(number->number*number)
//		.forEach(System.out::println);
//		
//	}
//
//	private static void printSquareOfNumbers(List<Integer> numbers) {
//		
//		numbers.stream().
//		map(number->number*number)
//		.forEach(System.out::println);
//	}

	private static void printAllCourseNames(List<String> courses) {
//		courses.stream().
//		forEach(System.out::println);
//		courses.stream()
//		.filter((course)->(course.contains("Spring"))) //find the word contain spring
//		.forEach(System.out::println);
//		courses.stream()
//		.filter(course->course.length()>=4)  //find the words which are greater than 4 characters
//		.forEach(System.out::println);
//		
		courses.stream()
		.map(course-> course + " " + course.length())
		.forEach(System.out::println);
	
}
}