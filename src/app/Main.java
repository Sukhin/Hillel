package app;

import java.util.Scanner;

import part1_app.InitialLookTwoDimensionalArray;
import part2_app.TwoDimensionalArrayOperations1;
import part3_app.TwoDimensionalArrayOperations2;
import part4_app.TwoDimensionalArrayOperations3;
import part5_app.TwoDimensionalArrayOperations4;
import part6_app.TwoDimensionalArrayOperations5;

public class Main {

    static int numberRowsTwoDimensionalArray;
    static int numberColumnsTwoDimensionalArray;
    static int[][] elementsTwoDimensionalArray;
    static int sumElementsEvenRowsTwoDimensionalArray;
    static int sumElementsOddRowsTwoDimensionalArray;
    static int productElementsEvenColumnsTwoDimensionalArray;
    static int productElementsOddColumnsTwoDimensionalArray;

    public static void main(String[] args) {

        System.out.println("Hello! Welcome to the program for processing two-dimensional arrays!");
        System.out.println("-".repeat(68));
        System.out.print("\n");
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter the number of rows in the two-dimensional array: ");
        numberRowsTwoDimensionalArray = enter.nextInt();
        enter.nextLine();
        System.out.print("Enter the number of columns in the two-dimensional array: ");
        numberColumnsTwoDimensionalArray = enter.nextInt();
        enter.nextLine();
        System.out.print("\n");
        elementsTwoDimensionalArray = new int[numberRowsTwoDimensionalArray][numberColumnsTwoDimensionalArray];
        System.out.println("Enter the values of the elements of the two-dimensional array!");
        System.out.print("\n");

        for (int i = 0; i < elementsTwoDimensionalArray.length; i++) {

            for (int j = 0; j < elementsTwoDimensionalArray[i].length; j++) {

                System.out.print("Enter the value of the element with index " + (i + 1) + (j + 1) + " of the two-dimensional array: ");
                elementsTwoDimensionalArray[i][j] = enter.nextInt();

            }

        }

        System.out.print("\n");
        System.out.println("Initial look of two-dimensional the array!");
        System.out.print("\n");
        InitialLookTwoDimensionalArray.printElementsTwoDimensionalArray(elementsTwoDimensionalArray, numberRowsTwoDimensionalArray, numberColumnsTwoDimensionalArray);
        System.out.println("\n");
        sumElementsEvenRowsTwoDimensionalArray = TwoDimensionalArrayOperations1.sumElementsEvenRowsTwoDimensionalArray(elementsTwoDimensionalArray);
        System.out.println("Sum the elements in the even-numbered rows (row ) of the two-dimensional array: " + sumElementsEvenRowsTwoDimensionalArray);
        System.out.println("\n");
        sumElementsOddRowsTwoDimensionalArray = TwoDimensionalArrayOperations2.sumElementsOddRowsTwoDimensionalArray(elementsTwoDimensionalArray);
        System.out.println("Sum the elements in the odd rows (row ) of the two-dimensional array: " + sumElementsOddRowsTwoDimensionalArray);
        System.out.println("\n");
        productElementsEvenColumnsTwoDimensionalArray = TwoDimensionalArrayOperations3.productElementsEvenColumnsTwoDimensionalArray(elementsTwoDimensionalArray);
        System.out.println("Product the elements in the even-numbered columns of the two-dimensional array: " + productElementsEvenColumnsTwoDimensionalArray);
        System.out.println("\n");
        productElementsOddColumnsTwoDimensionalArray = TwoDimensionalArrayOperations4.productElementsOddColumnsTwoDimensionalArray(elementsTwoDimensionalArray);
        System.out.println("Product the elements in the odd columns of the two-dimensional array: " + productElementsOddColumnsTwoDimensionalArray);

        System.out.println("\n");

        if (numberRowsTwoDimensionalArray == numberColumnsTwoDimensionalArray) {

            TwoDimensionalArrayOperations5.FunctionCheckMatrixMagicSquare(elementsTwoDimensionalArray, numberRowsTwoDimensionalArray, numberColumnsTwoDimensionalArray);

        } else {

            System.out.print("The matrix is not a square!");

        }

        System.out.println("\n");
        System.out.println("-".repeat(21));
        System.out.println("Always happy to help!");

    }

}