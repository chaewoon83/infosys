package com.example.lib;

public class MyRectangle2D {

    private double x;
    private double y;
    private double width;
    private double height;

    MyRectangle2D(){
        x=0;
        y=0;
        width=1;
        height=1;
    }
    MyRectangle2D(double a, double b, double c, double d){
        x=a;
        y=b;
        width=c;
        height=d;
    }

    double getX(){
        return x;
    }
    void setX(double n){
        x=n;
    }

    double getY(){
        return y;
    }
    void setY(double n){
        y=n;
    }

    double getWidth(){
        return width;
    }
    void setWidth(double n){
        width=n;
    }
    double getHeight(){
        return height;
    }
    void setHeight(double n){
        height=n;
    }

    double getArea(){
        return height * width;
    }

    double getPerimeter(){
        return 2*(height+width);
    }

    public boolean contains(double a, double b){
        if(x-width/2<=a && a<=x+width/2 && y-height/2<=b && b<=y+height/2){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean contains(MyRectangle2D r){
        if(x-width/2<=r.x-r.width/2 && r.x+r.width/2<=x+width/2 && y-height/2<=r.y-r.height/2 && r.y+r.height/2<=y+height/2){
            return true;
        }

        else{
            return false;
        }

    }

    public boolean overlaps(MyRectangle2D r){
        if(x-width/2<=r.x-r.width/2 && r.x+r.width/2<=x+width/2 && y-height/2<=r.y-r.height/2 && r.y+r.height/2<=y+height/2){
            return false;
        }
        else if(x+width/2<=r.x-r.width/2 || x-width/2>=r.x+r.width/2 || y-height/2>=r.y-r.height/2 || r.y+r.height/2>=y+height/2){
            return false;
        }
        else{
            return true;
        }

    }


}


