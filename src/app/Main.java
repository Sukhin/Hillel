package app;

import java.util.Scanner;

        public class Main {
        static int maximumValueRange;
        static int sum;
        static int totalSum;

            public static void main (String [] args) {
            System.out.println("Hello! Welcome in the program for calculating sum of the whole numbers!");
            System.out.print("Enter the maximum value of a range of integers to calculate their sum, starting from one: ");
            Scanner enter = new Scanner (System.in);
            maximumValueRange = enter.nextInt();
            enter.nextLine();
            System.out.print("\n");

            int initialValue = 0;

                for (int initialValueRange=1; initialValueRange<=maximumValueRange; initialValueRange++) {
                sum = initialValueRange+initialValue;
                initialValue=sum;
                System.out.println(initialValueRange+")"+" Num is"+" "+initialValueRange+","+" sum is"+" "+ sum);

                    if (initialValueRange==maximumValueRange) {
                    totalSum=sum;
                     }

                 }

                System.out.println("Sum of numbers is "+totalSum);
                System.out.println("-".repeat(24));
                System.out.print("\n");
                System.out.print("Always happy to help!");

            }
        }