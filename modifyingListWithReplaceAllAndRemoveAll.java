import java.util.ArrayList;
import java.util.List;

public class modifyingListWithReplaceAllAndRemoveAll {
public static void main(String[] args) {
	List<String>courses=List.of("spring","spring boot","aws","docker","kubernates");
	List<String>modifiablecourse=new ArrayList<String>(courses);
	modifiablecourse.replaceAll(String::toUpperCase);
	System.out.println(modifiablecourse);
	System.out.println(modifiablecourse.removeIf(str->str.length()>5));
	
}
}
