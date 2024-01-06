import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatioOfStreamsUsingStreams {
	public static void main(String[] args) {
		List<Integer>numbers=List.of(12,3,4,5,6,7,8);
		System.out.println(numbers.stream());//java.util.stream.ReferencePipeline$Head@762efe5d
		int[] numberArrays= {12,1,2,3,4,5};
//		System.out.println(Arrays.stream(numberArrays));//java.util.stream.IntPipeline$Head@470e2030
//		System.out.println(Arrays.stream(numberArrays).sum());//27
//		System.out.println(Arrays.stream(numberArrays).average());//OptionalDouble[4.5]
//		System.out.println(Arrays.stream(numberArrays).max());//OptionalInt[12]
//		System.out.println(Arrays.stream(numberArrays).min());//OptionalInt[1]
//		numbers.stream().forEach(System.out::println);//creating streams using list
//		//Stream.of(12,3,4,5,6,7,8).forEach(System.out::println);//creating stream directly
//		//Stream.of(12,3,4,5,6,7,8).count();
//		System.out.println(IntStream.range(1, 10).sum());;//excludes last number 10
//		System.out.println(IntStream.rangeClosed(1, 10).sum());//includes last number 10
//		System.out.println(IntStream.iterate(1, e->e+2).limit(10).sum());//100
		//System.out.println(IntStream.iterate(1, e->e+2).limit(10).peek(System.out::println).sum());
		//System.out.println(IntStream.iterate(2, e->e+2).limit(10).peek(System.out::println).sum());
	//System.out.println(IntStream.range(1, 11).mapToDouble(e->(int)Math.pow(2, e)).peek(System.out::println).sum());
	//System.out.println(IntStream.iterate(2, e->e*2).limit(10).peek(System.out::println).sum());
		System.out.println(IntStream.iterate(2, e->e*2).limit(10).peek(System.out::println).boxed().collect(Collectors.toList()));
	}

	
}
