package Day13;

public class JavaGenricsTask2 {

	public static void main(String[] args) {
		Integer[] array1= {1,2,3,4,5,6};
		Character[] array2= {'A','B','C','D','E','F'};
		Double[] array3= {1.2,3.5,2.3,5.6,7.9};
		
		toPrint(array1);
		toPrint(array2);
		toPrint(array3);

	}

	private static <E> void toPrint(E[] array1) {
		System.out.println("Array Values are");
		for (E i:array1) {
			System.out.println(i);
		}
		
	}

}
