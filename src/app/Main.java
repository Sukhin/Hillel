package app;

import java.util.Scanner;
import java.util.Locale;

        public class Main {

        static int numberEnterprises;
        static String nameEnterprises;
        static float volumeIncome;
        static float amountTaxation;

            public static void main (String [] args) {

            System.out.println("Hello! Welcome to the program for calculating income taxes on a progressive scale!");
            Scanner enter = new Scanner (System.in);
            enter.useLocale(Locale.GERMANY);
            System.out.print("Enter the total number of enterprises for which taxation will be calculated: ");
            numberEnterprises=enter.nextInt();
            enter.nextLine();

            int count = 1;

                while (count<=numberEnterprises) {

                System.out.print("\n");
                System.out.print("Enter the name of enterprise: ");
                nameEnterprises=enter.nextLine();
                System.out.print("Enter the company's revenue level UAH: ");
                volumeIncome=enter.nextFloat();
                enter.nextLine();


                    if (0<volumeIncome&&volumeIncome<=10000) {

                        final float taxRate=2.5f;
                        amountTaxation=volumeIncome/100*taxRate;

                    }

                    else if (10000<=volumeIncome&&volumeIncome<=25000) {

                        final float taxRate; taxRate=4.3f;
                        amountTaxation=volumeIncome/100*taxRate;

                    }

                    else if (volumeIncome>=25000) {

                        final float taxRate;  taxRate=6.7f;
                        amountTaxation=volumeIncome/100*taxRate;

                    }

                    else {

                        System.out.print("\n");
                        System.out.println("The amount of income is zero!");

                    }

                    if (0<volumeIncome) {

                        System.out.print("\n");
                        System.out.println("Enterprise № " + count + ".");
                        System.out.println("Name of the enterprise " + nameEnterprises + ".");
                        System.out.printf("Volume of the income of an enterprise: %.2f UAH.%n", volumeIncome);
                        System.out.printf("Level of the taxation of an enterprise: %.2f UAH.%n", amountTaxation);

                    }

                count += 1;

                }

            System.out.print("\n");
            System.out.print("Always happy to help!");

            }

        }