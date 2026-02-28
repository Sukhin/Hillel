package project_part4;

import project_part5.Figure;

public class Square implements Figure {

    private double length;
    private double width;

    public Square(double l, double w) {

        this.length = l;
        this.width = w;

    }

    public void setLength(double l) {

        this.length = l;

    }

    public void setWidth(double w) {

        this.width = w;

    }

    public double getLength() {

        return length;

    }

    public double getWidth() {

        return width;

    }

    @Override
    public double getArea() {

        return length * width;

    }

}
