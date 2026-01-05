package Day1617;

import java.util.Arrays;

public class SelectionSortExamScores {

    // Method to perform Selection Sort
    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            // Assume the first unsorted element is the minimum
            int minIndex = i;

            // Find the actual minimum in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] examScores = {88, 72, 95, 60, 78, 85};

        System.out.println("Before Sorting: " + Arrays.toString(examScores));

        selectionSort(examScores);

        System.out.println("After Sorting:  " + Arrays.toString(examScores));
    }
}
