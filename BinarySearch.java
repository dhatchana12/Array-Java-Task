import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Input elements of the array (sorted)
        System.out.println("Enter the elements of the array (sorted):");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the element to be searched
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Perform binary search
        int index = binarySearch(array, target);

        // Output the result
        if (index != -1) {
            System.out.println(target + " found at index " + index);
        } else {
            System.out.println(target + " not found in the array");
        }

        scanner.close();
    }

    // Method to perform binary search on a sorted array
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (array[mid] == target) {
                return mid;
            }

            // If target is greater, ignore left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // Element not found
        return -1;
    }
}
