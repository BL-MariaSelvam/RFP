package Day27;

import java.util.Arrays;
import java.util.List;

public class StreamOwn {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Apple","Banana","Orange","Strwaberry");
		
		names.stream().filter(name->name.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
	}

}
