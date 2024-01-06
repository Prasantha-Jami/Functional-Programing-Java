import java.util.List;
import java.util.function.Supplier;

public class FP03MethodReference {
	public static void main(String[] args) {
	List<String> courses = List.of("spring","springboot","azure","docker","kubernets");
	listOfCourses(courses);
	}
	public static void print(String str) {
		System.out.println(str);
	}

	private static void listOfCourses(List<String> courses) {
		
		courses.stream()
		//.map(str->str.toUpperCase())
		.map(String::toUpperCase)//method refence
		.forEach(FP03MethodReference::print);
		
	}
	Supplier<String>supplier=()->new String();
	Supplier<String>supplier1=String::new;//constructor refernce
}
