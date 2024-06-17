public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 6, 4, 8, 7, 2};

        // Print the original array
        System.out.println("Original Array:");
        printArray(array);

        // Sort the array using insertion sort
        insertionSort(array);

        // Print the sorted array
        System.out.println("Sorted Array:");
        printArray(array);
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key, to one position ahead
            // of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
