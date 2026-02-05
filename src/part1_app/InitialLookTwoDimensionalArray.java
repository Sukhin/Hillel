package part1_app;

public class InitialLookTwoDimensionalArray {

    public static void printElementsTwoDimensionalArray(int[][] array, int row, int columns) {

        System.out.println("   " + "Matrix " + row + "x" + columns + ":");

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.printf("%3d ", array[i][j]);

            }

            System.out.println();

        }

        System.out.print("\n");

    }

}