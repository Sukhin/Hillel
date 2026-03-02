package project_part1;

import project_part2.Day;

import project_part3.AdviseDay;

import java.util.Scanner;

import java.util.Locale;

public class WeekAdvisor implements AdviseDay {

    public WeekAdvisor() {

    }

    @Override
    public void generateAdvise(Day day) {

        switch (day) {

            case MONDAY,
                 TUESDAY,
                 WEDNESDAY,
                 THURSDAY:

                System.out.println("If it is a work day with (Monday to Thursday) then to print to the console advise on how to be productive at work.");
                break;

            case FRIDAY:

                System.out.println("If it is Friday, print to the console \"Happy Friday!\"");
                break;

            case SATURDAY,
                 SUNDAY:

                System.out.println("If it is a weekend day, print to the console the places you would recomended visiting.");
                break;

            default:

                System.out.println("Unknow day!");
        }

    }

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        enter.useLocale(Locale.US);
        System.out.println("Hello! Welcome to the program demonstrating the use of enums in the Java programming language!");
        System.out.println("-".repeat(94));
        System.out.print("\n");
        System.out.print("Enter the number of a day of the week (maximum 7 days): ");
        int numberDays = enter.nextInt();
        enter.nextLine();


        int count = 1;

        while (count <= numberDays) {

            System.out.print("Enter the name of a day of the week: ");
            String nameDay = enter.nextLine().toUpperCase();
            System.out.print("\n");
            WeekAdvisor advisor = new WeekAdvisor();
            Day day = Day.valueOf(nameDay);
            advisor.generateAdvise(day);
            System.out.print("\n");

            count += 1;

        }

        System.out.println("-".repeat(21));
        System.out.println("Always happy to help!");

    }

}