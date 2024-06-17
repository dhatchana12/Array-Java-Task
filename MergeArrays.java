import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        // Merge the two arrays
        int[] mergedArray = mergeArrays(array1, array2);

        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        // Create a new array with the combined length of array1 and array2
        int[] mergedArray = new int[array1.length + array2.length];

        // Copy elements from the first array
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);

        // Copy elements from the second array
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        return mergedArray;
    }
}
