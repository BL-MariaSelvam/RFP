package Day13;

public class JavaGenericsTask3 <E>{
	E[] myArray;
	
	
	
	public JavaGenericsTask3(E[] myArray) {
		this.myArray = myArray;
	}

	public static void main(String[] args) {
		Integer[] array1= {1,2,3,4,5,6};
		Character[] array2= {'A','B','C','D','E','F'};
		Double[] array3= {1.2,3.5,2.3,5.6,7.9};
		
		toPrint(array1);
		toPrint(array2);
		toPrint(array3);

		new JavaGenericsTask3(array1).toPrint();
		new JavaGenericsTask3<Character>(array2).toPrint();
		new JavaGenericsTask3<Double>(array3).toPrint();
	}

	private void toPrint() {
		toPrint(myArray);
		
	}

	private static <E> void toPrint(E[] array1) {
		System.out.println("Array Values are");
		for (E i:array1) {
			System.out.println(i);
		}
		
	}

}
