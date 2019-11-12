package com.example.pset2a;

import java.util.Comparator;

public class OctagonComparator implements Comparator<Octagon> {
    @Override
    public int compare(Octagon t1, Octagon t2) {
        if (t1.getSide()>t2.getSide()){
            return 1;
        }
        else if (t1.getSide()==t2.getSide()){
            return 0;
        }
        else{
            return -1;
        }
    }
}
