package com.example.pset2a;

public class TestExceptions2 {
    public static void main (String[] args){

        String str = "hat"; //대상 문자열
        /*A=0 B=1 C=2 D=3 E=4 F=5 G=6의 index를 가진다.*/

        System.out.print(str.substring(2)+"  ");
        /*substring(시작위치) 결과값 = DEFG*/

        System.out.print(str.substring(2, 2));
    }
    static void f ( int x) throws Exception {
        try {
            if ( x < 0 ) throw new Exception();
            System.out.print( "P" );
        } catch ( Exception e){
            System.out.print( "Q" );
        }
    }

}
