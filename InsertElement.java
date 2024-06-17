public class InsertElement {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 6, 4, 8, 7, 2, 10};
        int newElement = 15;
        int index = 5;

        // Print the original array
        System.out.println("Original Array:");
        printArray(array);

        // Insert the new element
        int[] newArray = insertElement(array, newElement, index);

        // Print the new array
        System.out.println("Array After Inserting Element " + newElement + " at Index " + index + ":");
        printArray(newArray);
    }

    public static int[] insertElement(int[] array, int element, int index) {
        // Check if the index is valid
        if (index < 0 || index > array.length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + array.length);
        }

        // Create a new array of size one more than the original array
        int[] newArray = new int[array.length + 1];

        // Copy elements from the original array to the new array up to the specified index
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        // Insert the new element at the specified index
        newArray[index] = element;

        // Copy the remaining elements from the original array to the new array
        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        return newArray;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

