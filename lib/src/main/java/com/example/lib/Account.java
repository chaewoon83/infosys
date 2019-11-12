package com.example.lib;
import java.util.Date;


public class Account {
    private static double annualInterestRate;
    private int id;
    private double balance;
    private Date dateCreated;

    Account(){
        id=0;
        balance=0;
        annualInterestRate=0;
    }
    Account(int n, double m){
        id =n;
        balance = m;
    }

    int getId(){
        return id;
    }

    void setId(int n){
        id = n;
    }

    public double getBalance(){
        return balance;
    }
    void setBalance(double a){
        balance = a;
    }

    double getAnnualInterestRate(){
        return annualInterestRate;
    }

    Date getDateCreated(){
        return dateCreated;
    }

    static void setAnnualInterestRate(double a){
        annualInterestRate = a;
    }

    static double getMonthlyInterestRate(){
        double monthlyInterest = annualInterestRate/12;
        return monthlyInterest;
    }

    double getMonthlyInterest(){
        return balance * getMonthlyInterestRate()/100;
    }

    void withdraw(double n){
        balance = balance - n;
    }
    void deposit(double n){
        balance = balance + n;
    }


}

