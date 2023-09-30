package task04;

public class Main {
    public static void main(String[] args) {

        final int[][] matrix1 = {
                {1, 4, 2},
                {-1, 4, 4},
                {-3, 4, 5},
        };
        final int[][] matrix2 = {
                {3, -2, 1},
                {4, 2, 0},
                {4, 2, 0}

        };

        //================================================================

        int[][] resultMatrix = MultiplicationMatrices(matrix1, matrix2);

        //================================================================

        if (resultMatrix != null) {
            System.out.println("Result matrix:");
            for (int i = 0; i < resultMatrix.length; i++) {
                for (int j = 0; j < resultMatrix[0].length; j++) {
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static int[][] MultiplicationMatrices(final int[][] matrix1, final int[][] matrix2) {
        final int numberOfRowsMatrix1 = matrix1.length;
        final int numberOfColumnsMatrix1 = matrix1[0].length;
        final int numberOfRowsMatrix2 = matrix2.length;
        final int numberOfColumnsMatrix2 = matrix2[0].length;

        if (numberOfColumnsMatrix1 != numberOfRowsMatrix2) {
            System.out.println("It is not possible to multiply matrices");
            return null;
        }

        int[][] resultMatrix = new int[numberOfRowsMatrix1][numberOfColumnsMatrix2];

        for (int i = 0; i < numberOfRowsMatrix1; i++) {
            for (int j = 0; j < numberOfColumnsMatrix2; j++) {
                for (int q = 0; q < numberOfColumnsMatrix1; q++) {

                    resultMatrix[i][j] += matrix1[i][q] * matrix2[q][j];
                }
            }
        }

        return resultMatrix;
    }
}
