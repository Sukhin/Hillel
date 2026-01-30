package app;

import part1_app.InitialLookArray;
import part2_app.ArraySort1;
import part3_app.ArraySort2;
import java.util.Scanner;

public class Main {

    static int numberElementsArray;
    static int[] elementsArray;
    static String line;
    static String[] parts;
    static int valueSearch;
    static int indexValueSearch;


    public static void main(String[] args) {

        System.out.println("Hello! Welcome to the program for processing arrays with various algorithms!");
        System.out.println("-".repeat(75));
        System.out.print("\n");
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter the number array of elements: ");
        numberElementsArray = enter.nextInt();
        enter.nextLine();
        elementsArray = new int[numberElementsArray];
        System.out.print("Enter the values array of elements: ");
        line = enter.nextLine();
        line = line.replace("[", "").replace("]", "");
        parts = line.split("[,.\\s]+");

        for (int i = 0; i < elementsArray.length; i++) {

            elementsArray[i] = Integer.parseInt(parts[i]);

        }

        System.out.print("Initial look the array: ");
        InitialLookArray.printElementsArray(elementsArray);
        System.out.print("Sorted array: ");
        InitialLookArray.printElementsArray(ArraySort1.insertionSort(elementsArray));
        System.out.print("Enter the number for to search in the array: ");
        valueSearch = enter.nextInt();
        indexValueSearch = ArraySort2.findIndexElementArray(ArraySort1.insertionSort(elementsArray), valueSearch);
        System.out.print("Index of the value " + valueSearch + " in the sorted array: " + indexValueSearch);
        System.out.println("\n");
        System.out.println("-".repeat(21));
        System.out.println("Always happy to help!");

    }
}