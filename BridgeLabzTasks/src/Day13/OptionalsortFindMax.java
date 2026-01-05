package Day13;

import java.util.Arrays;
import java.util.Optional;

public class OptionalsortFindMax{

public static <E extends Comparable<E>> Optional<E> findMax(E... values){
	
	if(values==null || values.length==0)
	{
		return Optional.empty();
	}
	Arrays.sort(values);
	return Optional.of(values[values.length-1]);
	
}

public static <E extends Comparable<E>> void printMax(E... values) {

    Optional<E> maxValue = findMax(values);

    if (maxValue.isPresent()) {
        System.out.println("Maximum value is: " + maxValue.get());
    } else {
        System.out.println("No values provided");
    }
}
}
