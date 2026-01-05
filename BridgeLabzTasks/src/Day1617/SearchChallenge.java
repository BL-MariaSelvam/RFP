package Day1617;

import java.util.Arrays;

public class SearchChallenge {

    // Linear search approach: Find first missing positive
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place each number in its "correct" position if possible
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int correctIndex = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }

        // Step 2: Find the first index where number is incorrect
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1; // First missing positive
            }
        }

        return n + 1; // If all 1..n are present
    }

    // Binary search approach: Find index of target
    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr); // Must sort first
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Not found
    }

    // Main method
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int target = 3;

        // Linear search: First missing positive
        int missing = firstMissingPositive(Arrays.copyOf(nums, nums.length));
        System.out.println("First missing positive integer: " + missing);

        // Binary search: Index of target after sorting
        int index = binarySearch(Arrays.copyOf(nums, nums.length), target);
        if (index != -1) {
            System.out.println("Target " + target + " found at index: " + index);
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }
}

