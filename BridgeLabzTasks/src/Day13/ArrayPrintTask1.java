package Day13;

public class ArrayPrintTask1 {

	public static void main(String[] args) {
		int[] array1= {1,2,3,4,5,6};
		char[] array2= {'A','B','C','D','E','F'};
		double[] array3= {1.2,3.5,2.3,5.6,7.9};
		
		toPrint(array1);
		toPrint(array2);
		toPrint(array3);
		

	}

	private static void toPrint(double[] array3) {
		System.out.println("Doublearray Values are");
		for(double i:array3) {
		System.out.println(i);
		}
		
	}

	private static void toPrint(char[] array2) {
		System.out.println("charIntarray Values are");
		for(char i:array2) {
		System.out.println(i);
		}
		
	}

	private static void toPrint(int[] array1) {
		System.out.println("Intarray Values are");
		for(int i:array1) {
		System.out.println(i);
		}
		
	}

}
