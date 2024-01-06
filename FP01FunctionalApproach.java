import java.util.List;

public class FP01FunctionalApproach {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(2, 3, 4, 5, 6, 7);
		// printAllNumbersInFunctional(numbers);
		// printEvenNumbersInFunctional(numbers);
		printOddNumbersInFunctional(numbers);
	}

	private static void printOddNumbersInFunctional(List<Integer> numbers) {
		numbers.stream().filter((num) -> num % 2 == 1).forEach(System.out::println);

	}

//	private static void print(int number) {
//		System.out.println(number);
//		
//	}
//	
//	private static boolean isEven(int number) {
//		return number%2==0;
//	}
	// private static void printAllNumbersInFunctional(List<Integer> numbers) {
	// what to do
//		numbers.stream()
//		.forEach(FP01FunctionalApproach::print);//method refernce

//		numbers.stream()
//		.forEach(System.out::println);
//		
//	}
//	private static void printEvenNumbersInFunctional(List<Integer> numbers) {
//		numbers.stream()
//		//.filter(FP01FunctionalApproach::isEven) //filter--allows only even numbers
//		.filter((number)->number%2==0)
//		.forEach(System.out::println);
//	}

}
