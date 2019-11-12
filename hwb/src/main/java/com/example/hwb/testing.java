package com.example.hwb;

import java.util.HashMap;

public class testing {
    public static void main(String[] args) {

        String[] str = new String[100];
        str[0] = "";
        str[1] = "qwertyuiopaass";

        AlphabetGenerator alph = new AlphabetGenerator();
        System.out.println((alph.generateFrequencyAlphabet(13, str)));
        System.out.println((alph.generateFrequencyAlphabet(13, str)).length);

    }
}