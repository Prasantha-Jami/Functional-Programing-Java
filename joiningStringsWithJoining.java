import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class joiningStringsWithJoining {
	public static void main(String[] args) {
		List<String>courses=List.of("spring","spring boot","AWS","Azure","Docker","Kubernates");
		System.out.println(
				courses.stream()
				.collect(Collectors.joining(" "))); //To join all the courses separated by space or comma
		
		//I wanted to take all strings in the list and I wantedto get the characters present in the  each azstring
		//"Spring".split(" ") ---It is creating String array with individual characters
		//String[6]{"s","p","r","i","n","g"}
		//we can create a stream and try to split each element in a stream
		//Stream Of String[]=>Stream Of strings
		//Stream[["s","p","r","i","n","g"],["A","W","S"]]=>["s","p","r","i","n","g","A","W","S"]
		System.out.println(courses.stream().map(course->course.split("")));
		System.out.println(courses.stream().map(course->course.split("")).flatMap(Arrays::stream).collect(Collectors.toList()));
		System.out.println(courses.stream().map(course->course.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()));
		//Identify pair of those courses having same no of characters present in them
		List<String>courses2=List.of("spring","spring boot","AWS","Azure","Docker","Kubernates");
		System.out.println(
				courses.stream()
				.flatMap(course->courses2.stream().map(course2->List.of(course,course2))).collect(Collectors.toList()));
		//To join each of the first element in the lit with first element in second list.
		//each elemnt of the stream is the list of two elements
		//I wanted to look for the elements having same length.
		//eleiminate same elemnts repeated twice
		System.out.println(
				courses.stream()
				.flatMap(course->courses2.stream().map(course2->List.of(course,course2))).filter(list->!list.get(0).equals(list.get(1))).collect(Collectors.toList()));
		//filter tuples with same length\
		System.out.println(
				courses.stream()
				.flatMap(course->courses2.stream().filter(course2->course2.length()==course.length())
						.map(course2->List.of(course,course2))).filter(list->!list.get(0).equals(list.get(1))).collect(Collectors.toList()));
		//flatMap allows helps in faltening stream of values so if we have stream of arrays we can flatten into stream of string
		
						
	}

}
