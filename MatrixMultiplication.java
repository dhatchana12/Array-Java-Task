public class MatrixMultiplication {
    public static void main(String[] args) {
        // Define two matrices
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Multiply the matrices
        int[][] product = multiplyMatrices(matrix1, matrix2);

        // Print the resulting product matrix
        System.out.println("Product of the matrices:");
        printMatrix(product);
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        // Check if the matrices can be multiplied
        if (cols1 != rows2) {
            throw new IllegalArgumentException("Number of columns in matrix1 must be equal to number of rows in matrix2");
        }

        // Create a product matrix
        int[][] product = new int[rows1][cols2];

        // Multiply the matrices
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return product;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

