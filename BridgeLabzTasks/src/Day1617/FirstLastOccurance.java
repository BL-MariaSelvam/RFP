package Day1617;

import java.util.Arrays;

public class FirstLastOccurance {

    // Method to find the first occurrence of target
    public static int findFirst(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int first = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                first = mid;       // Potential first occurrence
                right = mid - 1;   // Search left half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return first;
    }

    // Method to find the last occurrence of target
    public static int findLast(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                last = mid;        // Potential last occurrence
                left = mid + 1;    // Search right half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return last;
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int firstIndex = findFirst(arr, target);
        int lastIndex = findLast(arr, target);

        System.out.println("Array: " + Arrays.toString(arr));
        if (firstIndex != -1) {
            System.out.println("First occurrence of " + target + " at index: " + firstIndex);
            System.out.println("Last occurrence of " + target + " at index: " + lastIndex);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
