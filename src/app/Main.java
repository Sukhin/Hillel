package app;

import java.util.Scanner;

import part1_app.WorkWithMethodsPart_1;
import part2_app.WorkWithMethodsPart_2;
import part3_app.WorkWithMethodsPart_3;
import part4_app.WorkWithMethodsPart_4;
import part5_app.WorkWithMethodsPart_5;
import part6_app.WorkWithMethodsPart_6;

import java.util.Locale;

public class Main {

    static int wholeNumber;
    static double radiusCylinder;
    static double highCylinder;
    static double volumeCylinder;
    static String line;
    static String freeLine;
    static String[] valueLine;
    static int sumElementsArray;
    static int[] array;
    static String textEnter;
    static String reversText;
    static int a;
    static int b;
    static double numberPower;
    static int n;
    static String textLine;

    public static void main(String[] args) {

        System.out.println("Hello! Welcome to the program for working with the methods!");
        System.out.println("-".repeat(59));
        System.out.print("\n");
        Scanner enter = new Scanner(System.in);
        enter.useLocale(Locale.US);
        System.out.print("1. Enter a whole number: ");
        wholeNumber = enter.nextInt();
        enter.nextLine();
        WorkWithMethodsPart_1.calculationNumberSquare(wholeNumber);
        System.out.print("2. Enter the radius of the cylinder: ");
        radiusCylinder = enter.nextDouble();
        enter.nextLine();
        System.out.print("   Enter the high of the cylinder: ");
        highCylinder = enter.nextDouble();
        enter.nextLine();
        volumeCylinder = WorkWithMethodsPart_2.calculationVolumeCylinder(radiusCylinder, highCylinder);
        System.out.print("\n");
        System.out.print("3. Array of numbers: ");
        line = enter.nextLine();
        freeLine = line.replace("[", "").replace(",", "").replace("]", "");
        valueLine = freeLine.split("\\s+");
        array = new int[valueLine.length];

        for (int i = 0; i < valueLine.length; i++) {

            array[i] = Integer.parseInt(valueLine[i]);

        }

        sumElementsArray = WorkWithMethodsPart_3.sumElementsArray(array);
        System.out.println("   The sum of all elements in the array is " + sumElementsArray + ".");
        System.out.print("\n");
        System.out.print("4. Enter the string with text: ");
        textEnter = enter.nextLine();
        reversText = WorkWithMethodsPart_4.printReversText(textEnter);
        System.out.println("   The string in revers direction: " + reversText);
        System.out.print("\n");
        System.out.print("5. Enter a: ");
        a = enter.nextInt();
        enter.nextLine();
        System.out.print("   Enter b: ");
        b = enter.nextInt();
        enter.nextLine();
        numberPower = WorkWithMethodsPart_5.numberRaisePower(a, b);
        System.out.println("   The result of " + a + "^" + b + " is " + numberPower + ".");
        System.out.println("\n");
        System.out.print("6. Enter a whole number n: ");
        n = enter.nextInt();
        enter.nextLine();
        System.out.print("   Enter a text string: ");
        textLine = enter.nextLine();
        WorkWithMethodsPart_6.printText(n, textLine);
        System.out.println("\n");
        System.out.println("-".repeat(21));
        System.out.println("Always happy to help!");

    }

}