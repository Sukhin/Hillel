package part6_app;

public class ArrayCalculation6 {

    static float sum;

    static float average;

    public static float findAverageValueArray(int[] array) {

        int firsIndexNegativeValue=-1;

        for (int i = 0; i < array.length; i++) {

            if (0 > array[i]) {

                firsIndexNegativeValue = i;

                break;

            }
        }

        if (firsIndexNegativeValue==-1) {

            System.out.println("No negative values!");

            return 0;
        }

            int number=0;

            for (int j = firsIndexNegativeValue+1; j < array.length; j++) {

                sum += array[j];

                number++;

                average = sum / number;

            }

            if (number==0) return 0;

        return average;

    }

}
