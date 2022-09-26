package com.company;

public class increment_and_decrement_operator {
    public static void main(String[] args) {
        int i = 56;
//        int j = i++ (First j is assigned i (56) then i is incremented)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(++i);
//        System.out.println(++i);

        char ch = 'a';
        System.out.println(++ch);
    }
}
