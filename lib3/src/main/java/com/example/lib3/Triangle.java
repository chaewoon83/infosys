package com.example.lib3;

import java.lang.Math;

public class Triangle extends GeometricObject{

    private double side1=1;
    private double side2=1;
    private double side3=1;

    Triangle(){
        setColor("red");
        setFilled(true);
    }

    Triangle(double side11, double side22, double side33){
        side1 = side11;
        side2 = side22;
        side3 = side33;
    }



    public double getArea(){

        double s= (side1+side2+side3)/2;

        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

    }

    public double getPerimeter(){

        return side1+side2+side3;

    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

}
