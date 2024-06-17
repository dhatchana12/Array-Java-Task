import java.util.HashSet;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 6, 3, 4, 8, 7, 2, 1, 9};

        // Print the original array
        System.out.println("Original Array:");
        printArray(array);

        // Remove duplicates
        int[] uniqueArray = removeDuplicates(array);

        // Print the array after removing duplicates
        System.out.println("Array After Removing Duplicates:");
        printArray(uniqueArray);
    }

    public static int[] removeDuplicates(int[] array) {
        // Use a HashSet to remove duplicates
        HashSet<Integer> set = new HashSet<>();
        for (int value : array) {
            set.add(value);
        }

        // Convert the set back to an array
        int[] result = new int[set.size()];
        int index = 0;
        for (int value : set) {
            result[index++] = value;
        }

        return result;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
