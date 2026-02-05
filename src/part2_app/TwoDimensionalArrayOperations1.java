package part2_app;

public class TwoDimensionalArrayOperations1 {

    public static int sumElementsEvenRowsTwoDimensionalArray(int[][] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (i % 2 == 0) {

                    sum += array[i][j];

                }

            }

        }

        return sum;

    }

}
