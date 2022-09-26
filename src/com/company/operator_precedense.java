package com.company;

public class operator_precedense {
    public static void main(String[] args) {
//        precedense and associativity
        int a = 6*5-34/2;
        /*highest precedence goes to * and /. They are then evaluated on the basic of left to right
        associativity.
        =30-34/2
        =30-17
        =13
         */
        System.out.println(a);

        int b = 60/5-4*4;
        /* =12-4*4
        =12-16
        =-4
         */
        System.out.println(b);

//        quick quiz
        int c = 1;
        int d = 4;
        int e = 5;
        int f = (c*c) - (4*e*d)/(2*e);
        System.out.println(f);
    }
}
