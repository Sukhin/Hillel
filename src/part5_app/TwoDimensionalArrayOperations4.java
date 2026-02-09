package part5_app;

public class TwoDimensionalArrayOperations4 {

    static int product;

    public static int productElementsOddColumnsTwoDimensionalArray(int[][] array) {

        int count = 1;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (j % 2 != 0) {

                    product = count * array[i][j];

                    count = product;

                }

            }

        }

        return product;
    }

}
