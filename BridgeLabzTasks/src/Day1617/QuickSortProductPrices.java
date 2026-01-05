package Day1617;

import java.util.Arrays;

public class QuickSortProductPrices {

    // Quick Sort method
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            // Partition the array and get pivot index
            int pivotIndex = partition(prices, low, high);

            // Recursively sort elements before pivot
            quickSort(prices, low, pivotIndex - 1);

            // Recursively sort elements after pivot
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Partition method
    public static int partition(int[] prices, int low, int high) {
        int pivot = prices[high]; // Choosing last element as pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) { // If current element is smaller than pivot
                i++;
                // Swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Swap pivot into correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1; // Return pivot index
    }

    // Main method
    public static void main(String[] args) {
        int[] productPrices = {450, 299, 1200, 650, 199, 999};

        System.out.println("Before Sorting: " + Arrays.toString(productPrices));

        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("After Sorting:  " + Arrays.toString(productPrices));
    }
}

