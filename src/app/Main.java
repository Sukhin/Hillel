package app;

import java.util.Scanner;

import inside_part_project.Person;

public class Main {

    static int numbersPerson;
    static String name;
    static int age;
    static String profession;

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        System.out.println("Hello! Welcome to the program for working with classes and objects!");
        System.out.println("-".repeat(67));
        System.out.print("\n");
        System.out.print("Enter the numbers of persons: ");
        numbersPerson = enter.nextInt();
        enter.nextLine();
        System.out.println("\n");
        Person[] people = new Person[numbersPerson];

        int count = 1;

        while (count <= numbersPerson) {

            System.out.print("Enter the name " + count + " of the person: ");
            name = enter.nextLine();
            System.out.print("Enter the age " + count + " of the person: ");
            age = enter.nextInt();
            enter.nextLine();
            System.out.print("Enter the professional " + count + " of the person: ");
            profession = enter.nextLine();

            for (int i = 0; i < numbersPerson; i++) {

                people[i] = new Person(name, age, profession);

            }

            count += 1;
            System.out.println();

        }

        int number = 1;

        for (int j = 0; j < numbersPerson; j++) {

            System.out.println(number + "." + " Name: " + people[j].name + "," + " Age: " + people[j].age + "," + " Profession: " + people[j].profession);

            number += 1;

        }

        System.out.print("\n");
        System.out.print("Enter the index of a people in the array: ");
        int indexPeople = enter.nextInt();
        enter.nextLine();
        System.out.print("Enter the new profession of a people in the array: ");
        String newProfession = enter.nextLine();
        people[indexPeople].setProfession(newProfession);
        System.out.print("\n");
        System.out.println("(After update of the profession!)");
        System.out.print("\n");

        int valueNumber = 1;

        for (int j = 0; j < numbersPerson; j++) {

            System.out.println(valueNumber + "." + " Name: " + people[j].name + "," + " Age: " + people[j].age + "," + " Profession: " + people[j].profession);

            valueNumber += 1;

        }

        System.out.println("\n");
        System.out.println("-".repeat(21));
        System.out.println("Always happy to help!");

    }

}