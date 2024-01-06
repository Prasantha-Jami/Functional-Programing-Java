import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class bigNumberClacultaionsWithBigIntegerValues {
	public static void main(String[] args) {
		System.out.println(
				Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(IntStream.rangeClosed(1, 50).reduce(1, (x,y)->x*y));
//		System.out.println(LongStream.rangeClosed(1, 50).reduce(1, (x,y)->x*y));
//		System.out.println(LongStream.rangeClosed(1, 20).reduce(1, (x,y)->x*y));
//		System.out.println(IntStream.rangeClosed(1, 5).reduce(1, (x,y)->x*y));
//		System.out.println(LongStream.rangeClosed(1, 40).reduce(1,(x,y)->x*y));
		//To create big integer value-->take these elements and map it to bigIntegerObject
		System.out.println(LongStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply));
		
	}

}
