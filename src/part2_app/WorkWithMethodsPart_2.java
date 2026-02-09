package part2_app;

public class WorkWithMethodsPart_2 {

    public static double calculationVolumeCylinder(double radius, double high) {

        final double P = 3.14d;

        double volume = P * radius * radius * high;

        System.out.println("The volume of the cylinder with radius " + radius + " and high " + high + " is " + volume + ".");

        return volume;

    }

}
