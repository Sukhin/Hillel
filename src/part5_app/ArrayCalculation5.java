package part5_app;

public class ArrayCalculation5 {


    public static int findMaximumElementArray(int[] array) {

        int max = array[0];

        for (int value : array) {

            if (max < value) {

                max = value;

            }

        }

        return max;

    }

    public static int findIndexMaximumElementArray(int[] array) {

        int max = array[0];

        int indexMax = 0;

        for (int j = 0; j < array.length; j++) {

            if (max < array[j]) {

                max = array[j];

                indexMax = j;

            }

        }

        return indexMax;

    }

}
