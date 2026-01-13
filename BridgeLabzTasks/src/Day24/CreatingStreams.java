package Day24;

import static org.hamcrest.CoreMatchers.allOf;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreams {

	public static void main(String[] args) {

//		1.collections(list,set,map)
//		  collections in java have stream() method
		List<String> names=Arrays.asList("Maria","Peter","Rezenya","Rinit");
		Stream<String> namesStream=names.stream();
		namesStream.forEach(System.out::println);
		names.stream().forEach(System.out::println);
		
//		2.From Arrays
//		Arrays.stream() to create a stream from an array
		int[] numbers= {2,5,6,7,8,3,12};
		IntStream numberStream=Arrays.stream(numbers);
		numberStream.forEach(System.out::println);
		
//		3.Using stream.Of()
//		Stream.of() created a stream from individual elements or an array
		Stream<String> fruitStream=Stream.of("Apple","Banana","Orange","Mango");
		fruitStream.forEach(System.out::println);
		
//		4.Generating Streams
//		Stream.generate() - to create an infinate stream of values
		Stream<String> infinateStream=Stream.generate(()->"Hello").limit(3);
		infinateStream.forEach(System.out::println);
		
//		5.Create a Stream with Stream.iterate()
//		Example generating numbers starting from 5
		Stream<Integer> numbStream=Stream.iterate(5, n->n+1).limit(5);
		numbStream.forEach(System.out::println);
	}

}
