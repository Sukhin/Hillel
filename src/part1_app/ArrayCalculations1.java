package part1_app;

public class ArrayCalculations1 {

    public static int findSumNegativeElementsArray(int[] array) {

        int sum = 0;

        for (int value : array) {

            if (value < 0) {

                sum += value;

            }

        }

        return sum;

    }

}