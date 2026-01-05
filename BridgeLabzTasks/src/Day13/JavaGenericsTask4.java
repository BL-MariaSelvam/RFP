package Day13;

public class JavaGenericsTask4 <x,y,z>{
	x[] myXArray;
	y[] myYArray;
	z[] myZArray;
	

	public JavaGenericsTask4(x[] myXArray, y[] myYArray, z[] myZArray) {
		this.myXArray = myXArray;
		this.myYArray = myYArray;
		this.myZArray = myZArray;
	}

	public static void main(String[] args) {
		Integer[] array1= {1,2,3,4,5,6};
		Character[] array2= {'A','B','C','D','E','F'};
		Double[] array3= {1.2,3.5,2.3,5.6,7.9};
		
		toPrint(array1);
		toPrint(array2);
		toPrint(array3);
		
		new JavaGenericsTask4<Integer,Character,Double>(array1,array2,array3).toPrint();
	}

	private void toPrint() {
		toPrint(myXArray);
		toPrint(myYArray);
		toPrint(myZArray);
		
	}

	private static <E> void toPrint(E[] array1) {
		System.out.println("Array Values are");
		for (E i:array1) {
			System.out.println(i);
		}
		
	}

}
