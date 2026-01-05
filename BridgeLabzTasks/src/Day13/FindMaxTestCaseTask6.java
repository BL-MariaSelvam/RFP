package Day13;

public class FindMaxTestCaseTask6 {

	public static void main(String[] args) {
		
		System.out.println("Example of TestCase 1");
		Integer intMax=FindMaximum.findMax(340, 12, 89);
		System.out.println("MaxNumber at first testCase"+intMax);
		
		Double doubleMax=FindMaximum.findMax(3.40, 1.2, 0.89);
		System.out.println("MaxNumber at first testCase"+doubleMax);
		
		String strMax=FindMaximum.findMax("Orange", "Banana", "Apple");
		System.out.println("MaxString at first testCase"+strMax);

		System.out.println("Example of TestCase 2");
		Integer intMax1=FindMaximum.findMax(56,340, 89);
		System.out.println("MaxNumber at second testCase"+intMax1);
		
		Double doubleMax1=FindMaximum.findMax(6.89,8.40,0.89);
		System.out.println("MaxNumber at second testCase"+doubleMax1);
		
		String strMax1=FindMaximum.findMax("Grapes","Orange","Apple");
		System.out.println("MaxString at second testCase"+strMax1);
		
		System.out.println("Example of TestCase 3");
		Integer intMax2=FindMaximum.findMax(60,340, 890);
		System.out.println("MaxNumber at third testCase"+intMax2);
		
		Double doubleMax2=FindMaximum.findMax(6.89,8.40,9.89);
		System.out.println("MaxNumber at third testCase"+doubleMax2);
		
		String strMax2=FindMaximum.findMax("Grapes","Apple","Orange");
		System.out.println("MaxString at third testCase"+strMax2);

		
	}

}
