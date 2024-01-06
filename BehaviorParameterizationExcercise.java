import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*Do behaviour parameterization for the mapping logic
 * List SquaredNumbers=numbers.stream().map(x->x*x).collect(Collectors.toList());
 */
public class BehaviorParameterizationExcercise {
	public static void main(String[] args) {
		List<Integer>numbers=List.of(1,2,3,4,5,6);
		//List<Integer>squaredNumbers=squaredNumbers(numbers);
		List<Integer>doubleNumbers=doubleNumbers(numbers);
		
		//System.out.println(squaredNumbers);
		System.out.println(doubleNumbers);
		
		
		
		
	}

	private static List<Integer> doubleNumbers(List<Integer> numbers) {
		
		return PrintSquareNumbers(numbers, x->x+x);
	}

	private static List<Integer> squaredNumbers(List<Integer> numbers) {
		
		return PrintSquareNumbers(numbers, x->x*x);
	}

	private static List<Integer> PrintSquareNumbers(List<Integer> numbers, Function<Integer, Integer> function) {
		return numbers.stream()
				.map(function)
				.collect(Collectors.toList());
	}

}
