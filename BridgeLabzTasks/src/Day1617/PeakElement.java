package Day1617;

public class PeakElement {

	public static void main(String[] args) {
		 int[] arr = {1, 3, 20, 4, 1, 0};
		 
		 int left=0,right=arr.length-1,mid;

		 while(left<right) {
			 mid=left+(right-left)/2;
			 
			 if((arr[mid]>arr[mid-1]) && (arr[mid]>arr[mid+1])) {
				 System.out.println("Peak Element is "+arr[mid]);
				 break;
			 }
			 else if(arr[mid]<arr[mid-1]) {
				 right=mid-1;
			 }
			 else {
				 left=mid+1;
			 }
		 }
	}

}
