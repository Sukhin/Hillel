package part3_app;

public class TwoDimensionalArrayOperations2 {

    public static int sumElementsOddRowsTwoDimensionalArray(int[][] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (i % 2 != 0) {

                    sum += array[i][j];

                }

            }

        }

        return sum;

    }


}
