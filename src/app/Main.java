package app;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    static int totalNumberProducts;
    static String nameProduct;
    static int numberProductCertainTypeCertainPeriod;
    static float costProductCertainType;
    static  byte salesPeriod;
    static float totalSalesCertainPeriod;
    static float averageDailySalesVolume;

    public static void main(String[] args) {
        Scanner dataEntry = new Scanner(System.in);
        dataEntry.useLocale(Locale.GERMANY);
        System.out.println("Hello!");
        System.out.println("Welcome to the program for calculating the finances of an online store!");
        System.out.print("Enter the total number of products: ");
        totalNumberProducts=dataEntry.nextInt();
        dataEntry.nextLine();

        int first_Value=1;

        while (first_Value<=totalNumberProducts) {

            System.out.print("Enter name product: ");
            nameProduct=dataEntry.nextLine();
            System.out.print("Enter the number of products of a certain type sold for a certain period: ");
            numberProductCertainTypeCertainPeriod=dataEntry.nextInt();
            System.out.print("Enter the cost of the product: ");
            costProductCertainType=dataEntry.nextFloat();
            System.out.print("Enter the sales period: ");
            salesPeriod=dataEntry.nextByte();
            totalSalesCertainPeriod=numberProductCertainTypeCertainPeriod*costProductCertainType;
            dataEntry.nextLine();

            if(salesPeriod>0) {

                averageDailySalesVolume=totalSalesCertainPeriod/salesPeriod;
            }
            else {
                System.out.println("Can't divide by zero!");
                continue;
            }
            System.out.println("Product No"+" "+first_Value+":"+" "+nameProduct+",");
            System.out.printf("total sales for %d days is EUR %.2f,\n", salesPeriod,totalSalesCertainPeriod);
            System.out.printf("sales by day is EUR %.2f.\n", averageDailySalesVolume);

            first_Value+=1;
        }
        System.out.println("Always happy to help!");
    }
}