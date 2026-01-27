package part4_app;

public class ArrayCalculation4 {

    public static int findMinimumElementArray(int[] array) {

        int min = array[0];

        for (int value : array) {

            if (min > value) {

                min = value;

            }

        }

        return min;

    }

    public static int findIndexMinimumElementArray(int[] array) {

        int min = array[0];

        int indexMin = 0;

        for (int i = 0; i < array.length; i++) {

            if (min > array[i]) {

                min = array[i];

                indexMin = i;

            }

        }

        return indexMin;

    }

}
