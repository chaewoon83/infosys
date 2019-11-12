package com.example.lib;

import java.util.ArrayList;

public class Pset1 {
    public static boolean isAllCharacterUnique(String sIn) {
        ArrayList<Integer> wordlist = new ArrayList();
        String name = sIn;
        int nameLenght = name.length();
        for (int i = 0; i < nameLenght; i++) {
            char character = name.charAt(i);
            int ascii = (int) character;
            for (int j : wordlist){
                if(j==ascii){
                    return false;
                }
            }
            wordlist.add(ascii);
        }
        return true;
    }
    public static boolean isPermutation(String sIn1, String sIn2) {
        int k =0;
        //todo: add your implementation
        ArrayList<Integer> wordlist1 = new ArrayList();
        ArrayList<Integer> wordlist2 = new ArrayList();
        String name1 = sIn1;
        String name2 = sIn2;
        int name1Lenght = name1.length();
        int name2Lenght = name2.length();
        for (int i = 0; i < name1Lenght; i++) {
            char character = name1.charAt(i);
            int ascii = (int) character;
            wordlist1.add(ascii);
        }
        for (int i = 0; i < name2Lenght; i++) {
            char character = name2.charAt(i);
            int ascii = (int) character;
            wordlist2.add(ascii);
        }
        for(int q : wordlist1){
            for(int p : wordlist2){
                if(q==p){
                    k=1;
                }
            }
            if (k!=1){
                return false;
            }
        }
        return true;

    }
}
