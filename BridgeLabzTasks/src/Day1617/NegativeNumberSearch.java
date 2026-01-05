package Day1617;

public class NegativeNumberSearch {

	public static void main(String[] args) {
		int[] numbers= {12,-45,23,56,27,67,23};
		int flag=0,temp=0;
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]<0) {
				flag=1;
				temp=i;
				break;
			}
			else {
				flag=-1;
			}
		}
		if(flag==1) {
			System.out.println("The first negative number found at "+temp);
		}
		else {
			System.out.println("There is no negative numbers");
		}
	}

}
