import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class BehaviorParameterization {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 3, 4, 5, 6, 8, 9);
		printEvenNumbers(numbers);
		printOddNumbers(numbers);

	}

	private static void printOddNumbers(List<Integer> numbers) {
		printNumbers(numbers, (Predicate<Integer>) num -> num % 2 == 1);

	}

	private static void printEvenNumbers(List<Integer> numbers) {
		printNumbers(numbers, (Predicate<Integer>) num -> num % 2 == 0);

	}

	private static void printNumbers(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers.stream().filter(predicate).forEach(System.out::println);
	}

}
