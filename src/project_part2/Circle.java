package project_part2;

import project_part5.Figure;

public class Circle implements Figure {

    private double radius;

    public Circle(double R) {

        this.radius = R;
    }


    public void setRadius(double radius) {

        this.radius = radius;
    }


    public double getRadius() {

        return radius;

    }

    @Override
    public double getArea() {

        return Math.PI * radius * radius;

    }

}
