import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP03FunctionalInterfaceExcericse {
	public static void main(String[] args) {
//		Supplier<Integer>number=()->2;
//		System.out.println(number.get());
		//to get random number
		Supplier<Integer>randomNumber=()->{
			Random random=new Random();
			return random.nextInt(100);
	};
System.out.println(randomNumber.get());
UnaryOperator<Integer>number=(num)->3*num;
System.out.println(number.apply(3));
}
}
