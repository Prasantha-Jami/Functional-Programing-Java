import java.util.List;

public class FP02Structured {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,6,5,7,8);
		int sum=printSumOfNumbersInStructure(numbers);
		System.out.println(sum);
	}

	private static int printSumOfNumbersInStructure(List<Integer> numbers) {
		//how to loop
		//how to store sum
		int sum=0;
		for(int number:numbers) {
			sum+=number;
		}
		return sum;
		
		
	}
}
