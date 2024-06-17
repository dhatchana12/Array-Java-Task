public class RemoveElement {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 6, 4, 8, 7, 2, 10};
        int elementToRemove = 6;

        // Print the original array
        System.out.println("Original Array:");
        printArray(array);

        // Remove the given element
        int[] newArray = removeElement(array, elementToRemove);

        // Print the new array
        System.out.println("Array After Removing Element " + elementToRemove + ":");
        printArray(newArray);
    }

    public static int[] removeElement(int[] array, int element) {
        // Find the number of occurrences of the element to remove
        int count = 0;
        for (int value : array) {
            if (value == element) {
                count++;
            }
        }

        // If the element is not found, return the original array
        if (count == 0) {
            return array;
        }

        // Create a new array of the appropriate size
        int[] newArray = new int[array.length - count];
        int index = 0;
        for (int value : array) {
            if (value != element) {
                newArray[index++] = value;
            }
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

