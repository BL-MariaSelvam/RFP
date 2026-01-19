package Day27;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntermediaryFunctions {

	public static void main(String[] args) {
		//1.filter()-filters elements base on conditions
		List<String> names=Arrays.asList("Edan","Adam","Eve","romeo");
		List<String> filtered=names.stream().filter(name->name.startsWith("E")).collect(Collectors.toList());
		System.out.println(filtered);
		
//		2.Map() --to transform each element in the system
		List<String> namesList=Arrays.asList("Edan","Adam","Eve","romeo");
		List<String> upperList=namesList.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		List<String> upperList1=namesList.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperList);
		System.out.println(upperList1);
		
		List<Integer> numbers1=Arrays.asList(3,6,2,5,7,12);
		numbers1.stream().map(age->2026-age).forEach(System.out::println);
		
//		3.sorted-Sorts the element in natural order or comparator		
		
		List<Integer> numbers=Arrays.asList(3,2,12,6,2,5,7,12);
		List<Integer> sortedNumbers=numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNumbers);
		
//		4.distinct()--to remove duplicate numbers from the stream
		List<Integer> distinctNumbers=numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctNumbers);
		
//		5.flatmap--used in collection within colloection like list within list
		
		Function<Integer, Integer> func=(age)->2026-age;
		System.out.println("Year of birth "+func.apply(13));
		
		List<Integer> numbers2=Arrays.asList(3,6,2,5,7,12);
		List<Integer> numbers3=Arrays.asList(8,4,2,1,9,20);
		List<List<Integer>> numbersList1=Arrays.asList(numbers2,numbers3);
		numbersList1.stream().flatMap(list->list.stream()).map(age->2026-age).forEach(System.out::println);
		
		
		
	}

}
