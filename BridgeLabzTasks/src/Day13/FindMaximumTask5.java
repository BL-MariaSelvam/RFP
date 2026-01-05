package Day13;

public class FindMaximumTask5 {

	public static void main(String[] args) {
		System.out.println(findMax(100,30,190));
		System.out.println(findMax(10.7,30.2,1.8));
		System.out.println(findMax("Oraange","Apple","Avacado"));

	}

	private static <E extends Comparable<E>>E findMax(E a, E b, E c) {
		E max=a;
		
		if(b.compareTo(max)>0) {
			max=b;
		}
		if(c.compareTo(max)>0) {
			max=c;
		}
		return max;
	}

}
