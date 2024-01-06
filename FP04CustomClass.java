import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class courses {
	private String course;
	private String courseCategory;
	private int scorereview;
	private int noOfStudents;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return course + ":" + scorereview + ":" + noOfStudents;
	}

	public courses(String course, String courseCategory, int scorereview, int noOfStudents) {
		super();
		this.course = course;
		this.courseCategory = courseCategory;
		this.scorereview = scorereview;
		this.noOfStudents = noOfStudents;
	}

	public String getCourseCategory() {
		return courseCategory;
	}

	public void setCourseCategory(String courseCategory) {
		this.courseCategory = courseCategory;
	}

	public int getScorereview() {
		return scorereview;
	}

	public void setScorereview(int scorereview) {
		this.scorereview = scorereview;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

}

public class FP04CustomClass {
	public static void main(String[] args) {
		List<courses> course = List.of(new courses("spring", "framework", 97, 23000),
				new courses("springboot", "framework", 96, 22000), new courses("Azure", "cloud", 93, 13000),
				new courses("AWS", "cloud", 93, 14000), new courses("kubernates", "cloud", 81, 33000));
		// allmatch,nonematch,anymatch
//		Predicate<courses> courseReviewPredicateGreaterThan95 = courses -> courses.getScorereview() >= 95;
//		Predicate<courses> courseReviewPredicateLesserThan90 = courses -> courses.getScorereview() <= 90;
//		Predicate<courses> courseReviewPredicateGreaterThan80 = courses -> courses.getScorereview() >= 80;
//		Predicate<courses> courseReviewPredicateLesserThan80 = courses -> courses.getScorereview() <= 80;
//		System.out.println(course.stream().allMatch(courseReviewPredicateGreaterThan95));// F
//		System.out.println(course.stream().noneMatch(courseReviewPredicateLesserThan90));// F
//		System.out.println(course.stream().anyMatch(courseReviewPredicateGreaterThan80));// T
//		Predicate<courses> NumberOfSTudentsGreaterThan130000 = courses -> courses.getNoOfStudents() >= 13000;
//		Predicate<courses> NumberOfSTudentsGreaterThan20000 = courses -> courses.getNoOfStudents() >= 20000;
//		System.out.println(course.stream().allMatch(NumberOfSTudentsGreaterThan130000));// T
//		System.out.println(course.stream().noneMatch(NumberOfSTudentsGreaterThan20000));// F
//		System.out.println(course.stream().anyMatch(courses -> courses.getNoOfStudents() >= 23000));// T
//		Comparator<courses> comparingCoursesUsingNoOfStudentsbyIncreasingOrder = Comparator
//				.comparing(courses::getNoOfStudents);
//
//		// [Azure:93:13000, AWS:93:14000, springboot:96:22000, spring:97:23000,
//		// kubernates:81:33000]
//		System.out.println(course.stream().sorted(comparingCoursesUsingNoOfStudentsbyIncreasingOrder)
//				.collect(Collectors.toList()));
//
//		Comparator<courses> comparingCoursesUsingNoOfStudentsbyDecreasingOrder = Comparator
//				.comparing(courses::getNoOfStudents).reversed();
//
//		// [kubernates:81:33000, spring:97:23000, springboot:96:22000, AWS:93:14000,
//		// Azure:93:13000]
//		System.out.println(course.stream().sorted(comparingCoursesUsingNoOfStudentsbyDecreasingOrder)
//				.collect(Collectors.toList()));
//		// having same no of students then we need compare review score
//		Comparator<courses> comparingCoursesbyRevieScore = Comparator.comparing(courses::getNoOfStudents)
//				.thenComparing(courses::getScorereview);
//
//		// [Azure:93:13000, AWS:93:14000, springboot:96:22000, spring:97:23000,
//		// kubernates:81:33000]
//		System.out.println(course.stream().sorted(comparingCoursesbyRevieScore).collect(Collectors.toList()));
//		Comparator<courses> comparingReviewScore = Comparator.comparingInt(courses::getScorereview);
//		// [kubernates:81:33000, Azure:93:13000, AWS:93:14000, springboot:96:22000,
//		// spring:97:23000]
//		System.out.println(course.stream().sorted(comparingReviewScore).collect(Collectors.toList()));
//		Comparator<courses> comparingReviewScoreAndNoOfStudents = Comparator.comparingInt(courses::getNoOfStudents)
//				.thenComparingInt(courses::getScorereview);
//		// [Azure:93:13000, AWS:93:14000, springboot:96:22000, spring:97:23000,
//		// kubernates:81:33000]
//		System.out.println(course.stream().sorted(comparingReviewScoreAndNoOfStudents).collect(Collectors.toList()));
//		// skip,limit,takewhile,dropwhile
//		Comparator<courses> comparingNoOfStudentsUsingScoreReview = Comparator.comparingInt(courses::getScorereview);
//
//		// [kubernates:81:33000, Azure:93:13000, AWS:93:14000, springboot:96:22000]
//		System.out.println(
//				course.stream().sorted(comparingNoOfStudentsUsingScoreReview).limit(4).collect(Collectors.toList()));
//
//		// [AWS:93:14000, springboot:96:22000, spring:97:23000]
//		System.out.println(
//				course.stream().sorted(comparingNoOfStudentsUsingScoreReview).skip(2).collect(Collectors.toList()));
//
//		System.out.println(course);// [spring:97:23000, springboot:96:22000, Azure:93:13000, AWS:93:14000,
//									// kubernates:81:33000]
//
//		// takeWhileand dropWhile
//		// [spring:97:23000, springboot:96:22000]
//		System.out.println(
//				course.stream().takeWhile(courses -> courses.getScorereview() >= 96).collect(Collectors.toList()));
//		// [Azure:93:13000, AWS:93:14000, kubernates:81:33000]
//		System.out.println(
//				course.stream().dropWhile(courses -> courses.getScorereview() >= 96).collect(Collectors.toList()));
//		// max;min;top;findfirst;findfirst
//		// Optional[spring:97:23000]
//		System.out.println(course.stream().max(comparingNoOfStudentsUsingScoreReview));
//		// Optional[kubernates:81:33000]
//		System.out.println(course.stream().min(comparingNoOfStudentsUsingScoreReview));
//		// Optional[spring:97:23000]
//		System.out.println(
//				course.stream().filter(courseReviewPredicateGreaterThan80).max(comparingNoOfStudentsUsingScoreReview));
//
//		System.out.println(course.stream().filter(courseReviewPredicateLesserThan80).findFirst());
//
//		System.out.println(course.stream().filter(courseReviewPredicateGreaterThan95).findAny());
//
//		System.out.println(course.stream().filter(courseReviewPredicateLesserThan80).findFirst()
//				.orElse(new courses("spring", "framework", 97, 23000)));
//
//		// max; min;average,count
//
//		System.out.println(course.stream().filter(courseReviewPredicateGreaterThan95).mapToInt(courses::getNoOfStudents)
//				.average());// OptionalDouble[22500.0]
//		System.out.println(
//				course.stream().filter(courseReviewPredicateGreaterThan95).mapToInt(courses::getNoOfStudents).sum());// 45000
//		System.out.println(
//				course.stream().filter(courseReviewPredicateGreaterThan95).mapToInt(courses::getNoOfStudents).count());// 2
//		System.out.println(
//				course.stream().filter(courseReviewPredicateGreaterThan95).mapToInt(courses::getNoOfStudents).max());// OptionalInt[23000]
//		System.out.println(
//				course.stream().filter(courseReviewPredicateGreaterThan95).mapToInt(courses::getNoOfStudents).min());// OptionalInt[22000]
//
//		// group the courses by using some criteria.I wanted to create hashmap where I
//		// wanted to use category as key
//		System.out.println(course.stream().collect(Collectors.groupingBy(courses::getCourseCategory)));
//		// {cloud=[Azure:93:13000, AWS:93:14000, kubernates:81:33000],
//		// framework=[spring:97:23000, springboot:96:22000]}
//		System.out.println(
//				course.stream().collect(Collectors.groupingBy(courses::getCourseCategory, Collectors.counting())));
////{cloud=3, framework=2}
//		System.out.println(course.stream().collect(Collectors.groupingBy(courses::getCourseCategory,
//				Collectors.maxBy(Comparator.comparingInt(courses::getScorereview)))));
//
////{cloud=Optional[Azure:93:13000], framework=Optional[spring:97:23000]} 
//		System.out.println(course.stream().collect(Collectors.groupingBy(courses::getCourseCategory,
//				Collectors.mapping(courses::getCourse, Collectors.toList()))));
////{cloud=[Azure, AWS, kubernates], framework=[spring, springboot]}
		
		
		//creating high order function
		Predicate<courses> CourseReviewPredicateGreaterThan95 = CreatePredicateWithCutOffPredicate(95);
		System.out.println(course.stream().filter(CourseReviewPredicateGreaterThan95).mapToInt(courses::getNoOfStudents).sum());
		
		//FP and Intermediate  stream operations are lazy
		
		

	}

	private static Predicate<courses> CreatePredicateWithCutOffPredicate(int cutOffReviewScore) {
		return courses -> courses.getScorereview() >= cutOffReviewScore;
	}
}
