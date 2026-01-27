package part2_app;

public class ArrayCalculation2 {

    public static int findNumberPairedElementsArray(int[] array) {

        int numberPeriod = 0;

        for (int value : array) {

            if (value % 2 == 0) {

                numberPeriod += 1;

            }

        }

        return numberPeriod;

    }

}
