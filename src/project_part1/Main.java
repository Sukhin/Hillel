package project_part1;

import java.util.Scanner;

import project_part2.Employee;

import project_part3.Car;

public class Main {

    public static int numberUsers;
    public static String fullName;
    public static String position;
    public static String numberPhone;
    public static String email;
    public static byte age;
    public static String nameAction;

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        System.out.println("Hello! Welcome to the program demonstrating the principle of OOP: encapsulation!");
        System.out.println("-".repeat(80));
        System.out.print("\n");
        System.out.print("Enter the number of users whose data needs to be saved: ");
        numberUsers = enter.nextInt();
        enter.nextLine();
        System.out.print("\n");
        Employee[] person = new Employee[numberUsers];

        for (int i = 0; i < person.length; i++) {

            System.out.println("Employee number " + (i + 1));
            System.out.print("\n");
            System.out.print("Enter the full name of an employee: ");
            fullName = enter.nextLine();
            System.out.print("Enter the position of an employee: ");
            position = enter.nextLine();
            System.out.print("Enter the number phone of an employee: ");
            numberPhone = enter.nextLine();
            System.out.print("Enter the email of an employee: ");
            email = enter.nextLine();
            System.out.print("Enter the age of an employee: ");
            age = enter.nextByte();
            enter.nextLine();
            System.out.print("\n");

            person[i] = new Employee(fullName, position, numberPhone, email, age);

        }

        System.out.println();
        System.out.println("Grouped data");

        for (int j = 0; j < numberUsers; j++) {

            System.out.print("\n");
            System.out.println("Employee number " + (j + 1));
            System.out.print("\n");
            System.out.println("Full name of the employee: " + person[j].getFullName() + "." + " Position of the employee: " + person[j].getPosition() + "." + " Employee phone number: " + person[j].getNumberPhone() + "." + " Employee email: " + person[j].getEmail() + "." + " Age of the employee: " + person[j].getAge());

        }

        System.out.print("\n");
        System.out.print("If your data is not correct, then enter \"Yes\", if correct, enter \"No\": ");
        nameAction = enter.nextLine();

        if (nameAction.equals("Yes")) {

            System.out.print("\n");
            System.out.print("Enter the index of the person in the array: ");
            int indexObject = enter.nextInt();
            enter.nextLine();
            System.out.println();
            System.out.println("Employee number " + (indexObject + 1));
            System.out.print("\n");
            System.out.print("Enter the full name of an employee: ");
            fullName = enter.nextLine();
            System.out.print("Enter the position of an employee: ");
            position = enter.nextLine();
            System.out.print("Enter the number phone of an employee: ");
            numberPhone = enter.nextLine();
            System.out.print("Enter the email of an employee: ");
            email = enter.nextLine();
            System.out.print("Enter the age of an employee: ");
            age = enter.nextByte();
            enter.nextLine();
            System.out.print("\n");
            person[indexObject].setFullName(fullName);
            person[indexObject].setPosition(position);
            person[indexObject].setNumberPhone(numberPhone);
            person[indexObject].setEmail(email);
            person[indexObject].setAge(age);
            System.out.println("Full name of the employee: " + person[indexObject].getFullName() + "." + " Position of the employee: " + person[indexObject].getPosition() + "." + " Employee phone number: " + person[indexObject].getNumberPhone() + "." + " Employee email: " + person[indexObject].getEmail() + "." + " Age of the employee: " + person[indexObject].getAge());

        } else {

            System.out.println("Data is correct!");

        }

        System.out.print("\n");
        System.out.println("The start() method has started.");
        System.out.print("\n");
        Car machine = new Car();
        machine.star();
        System.out.println();
        System.out.println("-".repeat(21));
        System.out.println("Always happy to help!");

    }

}