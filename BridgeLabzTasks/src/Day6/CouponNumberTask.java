package Day6;

import java.util.Random;
import java.util.Scanner;

public class CouponNumberTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find Coupon number");
        int num = sc.nextInt();

        int[] arr = new int[num];
        int count = 0;
        int randomCount = 0;

        Random random = new Random();

        // initialize array with -1
        for (int i = 0; i < num; i++) {
            arr[i] = -1;
        }

        while (count < num) {
            int num1 = random.nextInt(num);
            randomCount++;

            boolean isNew = true;

            // check if already exists
            for (int i = 0; i < count; i++) {
                if (arr[i] == num1) {
                    isNew = false;
                    break;
                }
            }

            if (isNew) {
                arr[count] = num1;
                count++;
            }
        }

        System.out.println("The random numbers required is " + randomCount);
        System.out.println("The distinct Coupon numbers are:");
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
	}

}
