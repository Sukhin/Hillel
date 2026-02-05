package part6_app;

public class TwoDimensionalArrayOperations5 {

    public static void FunctionCheckMatrixMagicSquare(int[][] array, int numberRows, int numberColumns) {

        int[] sumRows = new int[numberRows];

        for (int i = 0; i < array.length; i++) {

            int sum = 0;

            for (int j = 0; j < array[0].length; j++) {

                sum += array[i][j];

            }

            sumRows[i] = sum;

        }

        int SumRow = sumRows[0];

        for (int k = 1; k < array.length; k++) {

            if (sumRows[k] != SumRow) {

                SumRow = 0;

                break;

            }

        }

        int[] sumColumns = new int[numberColumns];

        for (int i = 0; i < array[0].length; i++) {

            int sum = 0;

            for (int j = 0; j < array.length; j++) {

                sum += array[j][i];

            }

            sumColumns[i] = sum;

        }

        int SumColumn = sumColumns[0];

        for (int c = 1; c < array[0].length; c++) {

            if (SumColumn != sumColumns[c]) {

                SumColumn = 0;

                break;

            }

        }

        int sumMainDiagonal = 0;

        int sumSideDiagonal = 0;

        for (int p = 0; p < array.length; p++) {

            sumMainDiagonal += array[p][p];

        }

        for (int p = 0; p < array.length; p++) {

            sumSideDiagonal += array[p][array.length - 1 - p];

        }

        if (SumRow == SumColumn && SumColumn == sumMainDiagonal && sumMainDiagonal == sumSideDiagonal) {

            System.out.print("The matrix is a magic square!");

        } else {

            System.out.print("The matrix is not a magic square!");

        }

    }

}
