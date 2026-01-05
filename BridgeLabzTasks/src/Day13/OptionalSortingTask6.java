package Day13;

import java.util.Optional;

public class OptionalSortingTask6 {

	public static void main(String[] args) {
		Optional<Integer> intMax=OptionalsortFindMax.findMax(45,67,23,12);
		System.out.println("Maximum number is "+intMax.orElse(null));
		
		 // TC2: Multiple Floats
        Optional<Float> floatMax = OptionalsortFindMax.findMax(2.2f, 8.8f, 5.5f, 1.1f);
        System.out.println("TC2 - Float Max: " + floatMax.orElse(null));

        // TC3: Multiple Strings
        Optional<String> stringMax = OptionalsortFindMax.findMax("Apple", "Peach", "Banana", "Orange");
        System.out.println("TC3 - String Max: " + stringMax.orElse(null));

        // TC4: Single Value
        Optional<Integer> singleMax = OptionalsortFindMax.findMax(100);
        System.out.println("TC4 - Single Value Max: " + singleMax.orElse(null));

        // TC5: No Values
        Optional<Integer> emptyMax = OptionalsortFindMax.findMax();
        System.out.println("TC5 - No Values Max: " + emptyMax.orElse(null));
        
        OptionalsortFindMax.printMax(45,67,23,12);
        OptionalsortFindMax.printMax(2.2f, 8.8f, 5.5f, 1.1f);
        OptionalsortFindMax.printMax("Apple", "Peach", "Banana", "Orange");
        OptionalsortFindMax.printMax(100);
        OptionalsortFindMax.printMax();
        

	}

}
