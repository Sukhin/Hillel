package part3_app;

public class ArrayCalculation3 {

    public static int findNumberUnpairedElementsArray(int[] array) {

        int numberUnperiod = 0;

        for (int value : array) {

            if (value % 2 != 0) {

                numberUnperiod += 1;

            }

        }

        return numberUnperiod;

    }

}
