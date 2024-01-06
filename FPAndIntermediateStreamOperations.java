import java.util.List;

public class FPAndIntermediateStreamOperations {
	public static void main(String[] args) {
		List<String>courses=List.of("spring","java","spring boot","API","Microservice","Docker");
		System.out.println(courses.stream()
				.filter(course->course.length()>=10)
				.map(String::toUpperCase)
				.findFirst());
		
		System.out.println(courses.stream().peek(System.out::println)
				.filter(course->course.length()>=10)
				.map(String::toUpperCase).peek(System.out::println)
				.findFirst());
	}

}
