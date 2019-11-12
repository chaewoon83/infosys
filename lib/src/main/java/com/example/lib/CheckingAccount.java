package com.example.lib;

public class CheckingAccount extends Account {

    CheckingAccount(){
        setId(0);
        setBalance(0);
    }

    CheckingAccount(int n, double m){
        setId(n);
        setBalance(m);
    }
    void withdraw(double n){
        if(getBalance() - n <  -5000){
            System.out.println("overl limit");
        }
        else{
            setBalance(getBalance()-n);
        }
    }

}
