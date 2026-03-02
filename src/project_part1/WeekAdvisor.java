package project_part1;

import project_part2.Day;

import project_part3.AdviseDay;

import java.util.Scanner;

import java.util.Locale;

public class WeekAdvisor implements AdviseDay {

    public static int numberUsers;
    public static String nameSender;
    public static String textSender;

    @Override
    public void generateAdvise() {


    }

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        enter.useLocale(Locale.US);
        System.out.println("Hello! Welcome to the program demonstrating use of the inner classes and interface!");
        System.out.println("-".repeat(83));
        System.out.print("\n");
        System.out.print("Enter the number of users: ");
        numberUsers = enter.nextInt();
        enter.nextLine();
        System.out.print("\n");

        Person person = new Person();

        for (int i = 1; i <= numberUsers; i++) {

            System.out.print("Enter the text of the message: ");
            textSender = enter.nextLine();
            System.out.print("Enter the name sender of the message: ");
            nameSender = enter.nextLine();
            Person.Message messageUser = new Person.Message(textSender, nameSender);
            person.print(messageUser);
            System.out.print("\n");
            System.out.print("The data is correct: \"Yes\" or \"No\": ");
            String lineEnter = enter.nextLine();
            System.out.print("\n");

            while (lineEnter.equals("No")) {

                System.out.print("Enter the text of the message: ");
                textSender = enter.nextLine();
                messageUser.setText(textSender);
                System.out.print("Enter the name sender of the message: ");
                nameSender = enter.nextLine();
                messageUser.setSender(nameSender);
                System.out.print("\n");
                String updatedText = messageUser.getText();
                System.out.print("Updated the text of the message: " + updatedText);
                String updatedName = messageUser.getSender();
                System.out.print("Updated the name sender of the message: " + updatedName);
                System.out.println();
                System.out.print("\n");
                System.out.print("The data is correct: \"Yes\" or \"No\": ");
                lineEnter = enter.nextLine();
                System.out.print("\n");

            }

        }

        System.out.println("-".repeat(21));
        System.out.println("Always happy to help!");

    }

}