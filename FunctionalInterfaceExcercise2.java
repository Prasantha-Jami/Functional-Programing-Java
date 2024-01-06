import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class FunctionalInterfaceExcercise2 {
	
	public static void main(String[] args) {
		BiPredicate<Integer,String>biPredicate=(number,String)->{
			return (number>5&&String.length()>=5);
	};
	System.out.println(biPredicate.test(15, "Hello"));
	
	BiFunction<Integer,Integer,Integer>biFunction=(num1,num2)->{
		return num1*num2;
		
	};
	System.out.println(biFunction.apply(3,4));
  BiConsumer<String,String>biConsumer=(str1,str2)->{
	System.out.println(str1); 
	System.out.println(str2);
  };
  biConsumer.accept("welcome", "prasantha");
}
}
