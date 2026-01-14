package Day24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {

	public static void main(String[] args) {
		//1.forEach--performs action on each element
		List<String> names=Arrays.asList("Edan","Adam","Eve","romeo","Joyce");
		names.stream().forEach(System.out::println);
		
		//2.collect()--collects element into a collection like a list or set
		List<Integer> numbers=Arrays.asList(3,6,45,78,23,89,34,66);
		List<Integer> collectednum=numbers.stream().collect(Collectors.toList());
		System.out.println(collectednum);
		
		//3.count()--returns the number of elements in the stream
		
		long count=numbers.stream().count();
		System.out.println("count "+count);
		
		//4.reduce()--combine elements into a single value
		int sum=numbers.stream().reduce(0, Integer::sum);
		System.out.println("Total is "+sum);
	}

}
