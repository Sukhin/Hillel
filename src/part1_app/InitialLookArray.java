package part1_app;

public class InitialLookArray {

    public static int [] printElementsArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            if (i == 0) {

                System.out.print("[");

            }

            System.out.print(+array[i]);

            if (i < array.length - 1) {

                System.out.print(",");

            } else {

                System.out.print("]");

            }

        }

        System.out.print("\n");

        return array;

    }

}