package com.example.lib;

public class test {
    public static void main (String[] args) {
        double a = 1;
        double b = 1;
        MyRectangle2D myRectangle2D = new MyRectangle2D(0,0,2,2);

        System.out.println(myRectangle2D.getArea());
        System.out.println(myRectangle2D.getPerimeter());
        System.out.println(myRectangle2D.contains(0,0));
        System.out.println(myRectangle2D.getX()+myRectangle2D.getWidth()/2);
        System.out.println(myRectangle2D.getY()+myRectangle2D.getHeight()/2);
        char[] ch = "strange".toCharArray();
    }
}
