package app;

import part1_app.ArrayCalculations1;
import part2_app.ArrayCalculation2;
import part3_app.ArrayCalculation3;
import part4_app.ArrayCalculation4;
import part5_app.ArrayCalculation5;
import part6_app.ArrayCalculation6;

import java.util.Scanner;

public class Main {

    static int numberElementsArray;
    static int sumNegativeValue;
    static int numberPairedValue;
    static int numberUnpairedValue;
    static int maxValueArray;
    static int minValueArray;
    static int indexMin;
    static int indexMax;
    static float averageValueElementsArrayAboutNegative;

    public static void main(String[] args) {

        System.out.println("Hello! Welcome in the program for working with arrays!");
        Scanner enter = new Scanner(System.in);
        System.out.println("-".repeat(54));
        System.out.print("\n");
        System.out.print("Enter the number array of elements: ");
        numberElementsArray = enter.nextInt();
        int[] array = new int[numberElementsArray];
        System.out.println("Enter the values array of elements: ");

        for (int i = 0; i < array.length; i++) {

            array[i] = enter.nextInt();

        }

        sumNegativeValue = ArrayCalculations1.findSumNegativeElementsArray(array);
        numberPairedValue = ArrayCalculation2.findNumberPairedElementsArray(array);
        numberUnpairedValue = ArrayCalculation3.findNumberUnpairedElementsArray(array);
        minValueArray = ArrayCalculation4.findMinimumElementArray(array);
        maxValueArray = ArrayCalculation5.findMaximumElementArray(array);
        indexMin = ArrayCalculation4.findIndexMinimumElementArray(array);
        indexMax = ArrayCalculation5.findIndexMaximumElementArray(array);
        averageValueElementsArrayAboutNegative = ArrayCalculation6.findAverageValueArray(array);

        System.out.println("The sum of negative numbers: "+sumNegativeValue);
        System.out.println("The numbers of even values: "+numberPairedValue);
        System.out.println("The numbers of odd values: "+numberUnpairedValue);
        System.out.println("The minimum value of the array: "+minValueArray);
        System.out.println("The maximum value of the array: "+maxValueArray);
        System.out.println("The index of the maximum value in the array: "+indexMin);
        System.out.println("The index of the minimum value in the array: "+indexMax);
        System.out.printf("The arithmetic mean of the elements of the array starting after the first negative value: %.2f ",averageValueElementsArrayAboutNegative);
        System.out.println("\n");
        System.out.println("-".repeat(21));
        System.out.println("Always happy to help!");

    }
}