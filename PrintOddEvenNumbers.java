public class PrintOddEvenNumbers {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 6, 4, 8, 7, 2, 10};

        // Print the original array
        System.out.println("Original Array:");
        printArray(array);

        // Print odd and even numbers
        System.out.println("Even Numbers in the Array:");
        printEvenNumbers(array);

        System.out.println("Odd Numbers in the Array:");
        printOddNumbers(array);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printEvenNumbers(int[] array) {
        for (int value : array) {
            if (value % 2 == 0) {
                System.out.print(value + " ");
            }
        }
        System.out.println();
    }

    public static void printOddNumbers(int[] array) {
        for (int value : array) {
            if (value % 2 != 0) {
                System.out.print(value + " ");
            }
        }
        System.out.println();
    }
}
