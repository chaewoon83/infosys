package com.example.pset2a;


public class Palindrome {
    public static boolean isPalindrome (char[] S) {
        int len = S.length;
        if(len ==0 || len ==1){
            return true;
        }
        if (S[0] == S[len-1]){
            char[] newS = new char[len-2];
            for(int i=0; i<len-2;i++){
                newS[i]=S[i+1];
            }
            return isPalindrome (newS);
        }
        else{
            return false;
        }
    }

}
