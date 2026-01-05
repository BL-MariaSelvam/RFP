package Day1617;

public class LinearSearch {

	public static void main(String[] args) {
		int[] numbers= {34,12,56,78,33,51,99};
		int target=34,flag=0, temp=0;;
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==target) {
				flag=1;
				temp=i;
				break;
			}
			else {
				flag=0;
			}
		}
		if(flag==1) {
			System.out.println("Target element is found "+temp);
		}
		else {
			System.out.println("Target element is not found ");
		}
	}

}
