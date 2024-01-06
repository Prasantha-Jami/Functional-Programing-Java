import java.util.List;

public class FP01Structured {
	
	//traditional approach
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1,2,3,4,5);
		//PrintAllNumbersInStructured(numbers);
		PrintEvenNumbersInStructured(numbers);
	}

	private static void PrintAllNumbersInStructured(List<Integer> numbers) {
	
	//how to loop numbers
		for(int number: numbers) {
			System.out.println(number);
		}
	}
		
		private static void PrintEvenNumbersInStructured(List<Integer> numbers) {
			
			//how to loop numbers
				for(int number: numbers) {
					if(number%2==0)
				
					System.out.println(number);
				}
	
		
	}	
	
}
