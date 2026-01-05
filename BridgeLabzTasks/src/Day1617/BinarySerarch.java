package Day1617;

public class BinarySerarch {

	public static void main(String[] args) {
		int[] num= {12,34,66,79,84,92,99};
		int target=84, mid,left,right;
		left=0;
		right=num.length-1;
		
		while(left<=right) {
			mid=left+(right-left)/2;
			
			if(num[mid]==target) {
				System.out.println("Element is found at "+mid);
				break;
			}
			else if(num[mid]>target) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		

	}

}
