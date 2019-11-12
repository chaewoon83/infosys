package com.example.lib2;

public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    LinearEquation(double aa,double bb,double cc,double dd,double ee,double ff){
        a=aa;
        b=bb;
        c=cc;
        d=dd;
        e=ee;
        f=ff;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
    public boolean isSolvable(){
        if(b/a==d/c){
            return false;
        }
        else{
            return true;
        }
    }

    public double getX(){
        return (e-f*b/d)/(a-c*b/d);
    }
     public double getY(){
        return (e-f*a/c)/(b-d*a/c);
     }

}
