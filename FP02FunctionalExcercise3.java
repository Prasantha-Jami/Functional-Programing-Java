import java.util.Comparator;
import java.util.List;

public class FP02FunctionalExcercise3 {
	public static void main(String[] args) {
		//List<Integer>numbers=List.of(1,2,3,45,68,7,0,2,3);
//		numbers.stream()
		//.distinct().forEach(System.out::println);
//		.distinct().sorted().forEach(System.out::println);
		
		List<String>Courses=List.of("Spring","Spring Boot","API", "MicroServices","AMS","Azure","Docker","Kubernates");
		Courses.stream()
		//.sorted(Comparator.naturalOrder())
		//.sorted()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
	}

}
