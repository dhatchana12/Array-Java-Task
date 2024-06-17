import java.util.Arrays;

public class FindElements {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 6, 4, 8, 7, 2};

        // Sort the array
        Arrays.sort(array);

        // Find the second smallest and third largest elements
        int secondSmallest = array[1]; // Second smallest is at index 1
        int thirdLargest = array[array.length - 3]; // Third largest is at index length-3

        // Print the results
        System.out.println("Second smallest element: " + secondSmallest);
        System.out.println("Third largest element: " + thirdLargest);
    }
}
