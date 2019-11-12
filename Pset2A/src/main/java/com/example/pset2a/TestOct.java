package com.example.pset2a;

import java.util.ArrayList;
import java.util.Collections;

public class TestOct {
        public static void main(String[] args) {
            Palindrome p = new Palindrome();
            ArrayList<Octagon> l = new ArrayList<Octagon>();
            l.add(new Octagon(2));
            l.add(new Octagon(3));
            l.add(new Octagon(1));
            Collections.sort(l, new OctagonComparator());
            for (Octagon o:l)
                System.out.println(o.getSide());
            char[] k = {'a','b','a'};
            System.out.println(p.isPalindrome(k));
        }

}

