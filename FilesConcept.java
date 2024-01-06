import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FilesConcept {
	public static void main(String[] args) throws IOException {
		
//		Files.lines(Paths.get("File.txt"))
//		.forEach(System.out::println);
		//To find unique set of strings that are present in that specific file
		//once we read the lines, we need to do is to split the strings for that we use split
		//each lines is split into array of strings. so we will have a stream of arays of strings we wanted to convert them to single stream
//		Files.lines(Paths.get("File.txt"))
//		.map(str->str.split(" "))
//		.flatMap(Arrays::stream)
//		.distinct()
//		.sorted()
//		.forEach(System.out::println);
		Files.list(Paths.get("."))
		.filter(Files::isDirectory)
		.forEach(System.out::println);
		
		
	}

}
