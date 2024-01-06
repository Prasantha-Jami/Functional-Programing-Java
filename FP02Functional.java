import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(2,3,4,5,6,7);
		int sum=printSumOfNumbersInFunctional(numbers);
		System.out.println(sum);
	}
	public static int sum(int aggregate , int nextnumber) {
		System.out.println(aggregate+ " "+nextnumber);
		return aggregate+nextnumber;
		
	}

	private static int printSumOfNumbersInFunctional(List<Integer> numbers) {
		
		//stream of numbers->one result
		//combine them into one result-->one value
		//0 and FP02Functional::sum
		
//		return numbers
//				.stream()
//				.reduce(0, FP02Functional::sum);
		return numbers
				.stream()
				//.reduce(0, (x,y)->x+y);
				.reduce(0, Integer::sum);
	}
}
