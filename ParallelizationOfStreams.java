import java.util.stream.LongStream;

public class ParallelizationOfStreams {
	public static void main(String[] args) {
		//Wanted to get long values
		long time=System.currentTimeMillis();
		//System.out.println(LongStream.range(0, 1000000000).sum());//2024seconds
		//If we wanted to know how much time take to complete the calucation
	System.out.println(LongStream.range(0,1000000000).parallel().sum());//271sec
		System.out.println(System.currentTimeMillis()-time);
		
	}

}
