package Day1617;

import java.util.Arrays;

public class HeapSortSalaries {

    // Main Heap Sort method
    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Step 2: Extract elements one by one
        for (int i = n - 1; i >= 0; i--) {
            // Move current root (largest) to end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Call heapify on the reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Heapify a subtree rooted at index i
    public static void heapify(int[] salaries, int heapSize, int i) {
        int largest = i;         // Initialize largest as root
        int left = 2 * i + 1;    // Left child
        int right = 2 * i + 2;   // Right child

        // If left child is larger than root
        if (left < heapSize && salaries[left] > salaries[largest]) {
            largest = left;
        }

        // If right child is larger than largest
        if (right < heapSize && salaries[right] > salaries[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(salaries, heapSize, largest);
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] salaries = {50000, 75000, 60000, 90000, 55000};

        System.out.println("Before Sorting: " + Arrays.toString(salaries));

        heapSort(salaries);

        System.out.println("After Sorting:  " + Arrays.toString(salaries));
    }
}

