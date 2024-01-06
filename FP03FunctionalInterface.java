import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterface {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(23, 24, 56, 78, 9, 0);
		 printSquareOfEvenNumbers(numbers);
		

//		int sum=printSumOfNumbers(numbers);
		// System.out.println(sum);
	}

	// find functional interface behind the second argument of reduce method
	// numbers.stream().reduce(0,Integer::sum). create an implementation for
	// functional interface
	private static void printSumOfNumbers(List<Integer> numbers) {
		BinaryOperator<Integer> Binary = Integer::sum;
		BinaryOperator<Integer> Binary2 = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer num1, Integer num2) {
				return num1 + num2;
			}

		};
		 numbers.stream().reduce(0, Binary2);

	}

	private static void printSquareOfEvenNumbers(List<Integer> numbers) {
		Predicate<Integer> isEvenpredicate = number -> number % 2 == 0;
		Predicate<Integer> isEvenpredicate2 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer number) {
				return number % 2 == 0;
			}

		};

		Function<Integer, Integer> isSquareFunction = number -> number * number;
		Function<Integer, Integer> isSquareFunction2 = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer number) {
				return number * number;
			}

		};

		Consumer<Integer> sysoutconsumer = System.out::println;
		Consumer<Integer> sysoutconsumer2 = new Consumer<Integer>() {

			@Override
			public void accept(Integer number) {
				System.out.println(number);
			}

		};
		numbers.stream().filter(isEvenpredicate2).map(isSquareFunction2).forEach(sysoutconsumer2);
		
	}

}
