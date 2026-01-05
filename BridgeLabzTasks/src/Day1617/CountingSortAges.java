package Day1617;

import java.util.Arrays;

public class CountingSortAges {

    // Counting Sort method
    public static void countingSort(int[] ages) {
        int n = ages.length;

        // Step 1: Find the maximum age (here, we know max is 18)
        int max = 18;

        // Step 2: Create count array
        int[] count = new int[max + 1]; // index 0 to 18
        Arrays.fill(count, 0);

        // Step 3: Count frequency of each age
        for (int age : ages) {
            count[age]++;
        }

        // Step 4: Compute cumulative frequency
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Step 5: Place elements into output array
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) { // traverse backwards for stability
            int age = ages[i];
            output[count[age] - 1] = age;
            count[age]--;
        }

        // Step 6: Copy sorted ages back to original array
        for (int i = 0; i < n; i++) {
            ages[i] = output[i];
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] studentAges = {12, 15, 10, 14, 12, 18, 16, 13};

        System.out.println("Before Sorting: " + Arrays.toString(studentAges));

        countingSort(studentAges);

        System.out.println("After Sorting:  " + Arrays.toString(studentAges));
    }
}

