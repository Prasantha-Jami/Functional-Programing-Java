import java.util.List;


public class FP02FunctionalExcercise {
	public static void main(String[] args) {
		//squares of numbers and find sum of numbers
		List<Integer> numbers = List.of(1,2,3,4,5,6);
		
		//int result=printSquareAndSumOfNumbers(numbers);
		//int result1=printCubeAndSumOfNumbers(numbers);
//		int result2=printSumOfOddNumbers(numbers);
		int result3=printSumOfEvenNumbers(numbers);
		System.out.println(result3);
		//System.out.println(result2);
		//System.out.println(result1);
		//System.out.println(result);
		        
	}


	private static int printSumOfEvenNumbers(List<Integer> numbers) {
		return numbers
				.stream()
				.filter(number->number%2==0)
				.reduce(0,Integer::sum);
	}

	private static int printSumOfOddNumbers(List<Integer> numbers) {
		return numbers
				.stream()
				.filter(number->number%2==1)
				.reduce(0, Integer::sum);
	}

	private static int printCubeAndSumOfNumbers(List<Integer> numbers) {
		return numbers
				.stream()
				.map(x->x*x*x)
				.reduce(0, Integer::sum);
	}

	private static Integer printSquareAndSumOfNumbers(List<Integer> numbers) {
		return numbers
				.stream()
				.map(x->x*x)
				.reduce(0,Integer::sum);
		
	}

}
