package project_part1;

import java.util.Scanner;

import java.util.Locale;

import project_part2.Circle;

import project_part3.Triangle;

import project_part4.Square;

import project_part5.Figure;

public class Main {

    public static int numberCircle;
    public static int numberTriangle;
    public static int numberSquare;
    public static Figure[] arrayCircleShapes;
    public static Figure[] arrayTriangleShapes;
    public static Figure[] arraySquareShapes;
    public static String lineAnswer;
    public static int index;
    public static double radiusCircle;
    public static double heightTriangle;
    public static double widthTriangle;
    public static double lengthSquare;
    public static double widthSquare;

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        enter.useLocale(Locale.US);
        System.out.println("Hello! Welcome to the program demonstrating the principle of OOP: Polymorphism!");
        System.out.println("-".repeat(78));
        System.out.print("\n");
        System.out.print("Enter the number of circle: ");
        numberCircle = enter.nextInt();
        enter.nextLine();
        System.out.print("Enter the number of triangle: ");
        numberTriangle = enter.nextInt();
        enter.nextLine();
        System.out.print("Enter the number of square: ");
        numberSquare = enter.nextInt();
        enter.nextLine();
        arrayCircleShapes = new Figure[numberCircle];
        arrayTriangleShapes = new Figure[numberTriangle];
        arraySquareShapes = new Figure[numberSquare];
        System.out.print("\n");

        if (numberCircle != 0) {

            for (int i = 0; i < arrayCircleShapes.length; i++) {

                System.out.print("Enter the radius of circle " + (i + 1) + ": ");
                double radius = enter.nextDouble();
                enter.nextLine();
                arrayCircleShapes[i] = new Circle(radius);

            }

        }

        System.out.print("\n");

        if (numberTriangle != 0) {

            for (int j = 0; j < arrayTriangleShapes.length; j++) {

                System.out.print("Enter the height of triangle " + (j + 1) + ": ");
                double height = enter.nextDouble();
                enter.nextLine();
                System.out.print("Enter the width of triangle: " + (j + 1) + ": ");
                double width = enter.nextDouble();
                enter.nextLine();
                arrayTriangleShapes[j] = new Triangle(height, width);

            }

        }

        System.out.print("\n");

        if (numberSquare != 0) {

            for (int k = 0; k < arraySquareShapes.length; k++) {

                System.out.print("Enter the length of square " + (k + 1) + ": ");
                double length = enter.nextDouble();
                enter.nextLine();
                System.out.print("Enter the width of square " + (k + 1) + ": ");
                double width = enter.nextDouble();
                enter.nextLine();
                arraySquareShapes[k] = new Square(length, width);

            }

        }
        System.out.print("\n");
        System.out.println("Displaying the entered geometric parameters of geometric figure!");
        System.out.print("\n");

        for (int i = 0; i < arrayCircleShapes.length; i++) {

            Circle shapeCircle = (Circle) arrayCircleShapes[i];
            System.out.println("The radius of circle " + (i + 1) + ": " + shapeCircle.getRadius() + ".");

        }

        System.out.print("\n");
        System.out.print("If the radius is correct, write 'Yes'; if it is incorrect, write 'No': ");
        lineAnswer = enter.nextLine();
        System.out.print("\n");

        if (lineAnswer.equals("No")) {

            while (lineAnswer.equals("No")) {

                System.out.print("Enter the index of the circle: ");
                index = enter.nextInt();
                enter.nextLine();
                System.out.print("Enter the correct radius of the circle: ");
                radiusCircle = enter.nextDouble();
                enter.nextLine();
                Circle shapeCircle = (Circle) arrayCircleShapes[index];
                shapeCircle.setRadius(radiusCircle);
                System.out.println("Update the radius of circle " + (index + 1) + ": " + shapeCircle.getRadius() + ".");
                System.out.print("Is the updated the parameter of circle " + (index + 1) + " correct? 'Yes' or 'No': ");
                lineAnswer = enter.nextLine();
                System.out.print("\n");

            }

        }

        for (int j = 0; j < arrayTriangleShapes.length; j++) {

            Triangle shapeTriangle = (Triangle) arrayTriangleShapes[j];
            System.out.println("The height and width of triangle " + (j + 1) + ": " + shapeTriangle.getHeight() + " ; " + shapeTriangle.getHeight() + ".");

        }

        System.out.print("\n");
        System.out.print("If the height and width is correct, write 'Yes'; if it is incorrect, write 'No': ");
        lineAnswer = enter.nextLine();
        System.out.print("\n");

        if (lineAnswer.equals("No")) {

            while (lineAnswer.equals("No")) {

                System.out.print("Enter the index of the triangle: ");
                index = enter.nextInt();
                enter.nextLine();
                System.out.print("Enter the correct height of the triangle: ");
                heightTriangle = enter.nextDouble();
                enter.nextLine();
                System.out.print("Enter the correct width of the triangle: ");
                widthTriangle = enter.nextDouble();
                enter.nextLine();
                Triangle shapeTriangle = (Triangle) arrayTriangleShapes[index];
                shapeTriangle.setHeight(heightTriangle);
                shapeTriangle.setWidth(widthTriangle);
                System.out.println("Update the height and width of " + (index + 1) + ": " + shapeTriangle.getHeight() + " ; " + shapeTriangle.getWidth() + ".");
                System.out.print("Is the updated the parameters of triangle " + (index + 1) + " correct? 'Yes' or 'No': ");
                lineAnswer = enter.nextLine();
                System.out.print("\n");

            }

        }

        for (int k = 0; k < arraySquareShapes.length; k++) {

            Square shapeSquare = (Square) arraySquareShapes[k];
            System.out.println("The length and width of square " + (k + 1) + ": " + shapeSquare.getLength() + " ; " + shapeSquare.getWidth() + ".");

        }

        System.out.println();
        System.out.print("If the length and width is correct, write 'Yes'; if it is incorrect, write 'No': ");
        lineAnswer = enter.nextLine();
        System.out.print("\n");

        if (lineAnswer.equals("No")) {

            while (lineAnswer.equals("No")) {

                System.out.print("Enter the index of the triangle: ");
                index = enter.nextInt();
                enter.nextLine();
                System.out.print("Enter the correct length of the square: ");
                lengthSquare = enter.nextDouble();
                enter.nextLine();
                System.out.print("Enter the correct width of the square: ");
                widthSquare = enter.nextDouble();
                enter.nextLine();
                Square shapeSquare = (Square) arraySquareShapes[index];
                shapeSquare.setLength(lengthSquare);
                shapeSquare.setWidth(widthSquare);
                System.out.println("Update the length and width of " + (index + 1) + ": " + shapeSquare.getLength() + " ; " + shapeSquare.getWidth() + ".");
                System.out.print("Is the updated the parameters of square " + (index + 1) + " correct? 'Yes' or 'No': ");
                lineAnswer = enter.nextLine();
                System.out.print("\n");

            }

        }

        double sumAreaCircle = 0;

        for (int i = 0; i < arrayCircleShapes.length; i++) {

            System.out.printf("The area of the circle " + (i + 1) + ": %.3f.", arrayCircleShapes[i].getArea());
            sumAreaCircle += arrayCircleShapes[i].getArea();
            System.out.println();
        }

        System.out.printf("The total area of the circles: %.3f.", sumAreaCircle);

        System.out.println();
        System.out.print("\n");

        double sumAreaTriangle = 0;

        for (int j = 0; j < arrayTriangleShapes.length; j++) {

            System.out.printf("The area of the triangle " + (j + 1) + ": %.3f.", arrayTriangleShapes[j].getArea());
            sumAreaTriangle += arrayTriangleShapes[j].getArea();
            System.out.println();
        }

        System.out.printf("The total area of the triangle: %.3f.", sumAreaTriangle);

        System.out.println();
        System.out.print("\n");

        double sumAreaSquare = 0;

        for (int j = 0; j < arraySquareShapes.length; j++) {

            System.out.printf("The area of the square " + (j + 1) + ": %.3f.", arraySquareShapes[j].getArea());
            sumAreaSquare += arraySquareShapes[j].getArea();
            System.out.println();
        }

        System.out.printf("The total area of the square: %.3f.", sumAreaSquare);
        System.out.println();
        System.out.print("\n");

        double allSumAreaFigures = sumAreaCircle + sumAreaTriangle + sumAreaSquare;
        System.out.printf("The total area of all geometric shapes: %.3f.", allSumAreaFigures);

        System.out.print("\n");
        System.out.println();
        System.out.println("-".repeat(21));
        System.out.println("Always happy to help!");

    }

}