package project_part3;

import project_part5.Figure;

public class Triangle implements Figure {

    private double height;
    private double width;

    public Triangle(double h, double w) {

        this.height = h;
        this.width = w;

    }

    public void setHeight(double h) {

        this.height = h;

    }

    public void setWidth(double w) {

        this.width = w;
    }


    public double getHeight() {

        return height;

    }

    public double getWidth() {

        return width;

    }

    @Override
    public double getArea() {

        return height * width * 0.5;

    }

}