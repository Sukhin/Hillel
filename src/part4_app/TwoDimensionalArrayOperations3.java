package part4_app;

public class TwoDimensionalArrayOperations3 {

    static int product;

    public static int productElementsEvenColumnsTwoDimensionalArray(int[][] array) {

        int count = 1;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (j % 2 == 0) {

                    product = count * array[i][j];

                    count = product;

                }

            }

        }

        return product;

    }

}