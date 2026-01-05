package Day1617;

public class FindRotationPoint {

    // Method to find rotation point (index of smallest element)
    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2; // Safe mid calculation

            if (arr[mid] > arr[right]) {
                // Smallest element is in the right half
                left = mid + 1;
            } else {
                // Smallest element is in the left half including mid
                right = mid;
            }
        }

        // When left == right, we found the smallest element
        return left; // Index of rotation point
    }

    public static void main(String[] args) {
        int[] rotatedArray = {15, 18, 2, 3, 6, 12};

        int rotationIndex = findRotationPoint(rotatedArray);

        System.out.println("Rotation point index: " + rotationIndex);
        System.out.println("Smallest element: " + rotatedArray[rotationIndex]);
    }
}

