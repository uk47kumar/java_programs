package com.company;

public class method_overloading {
    static void M1(){
        System.out.println("Hello, bro good morning!");
    }
    static void M1(int a){
        System.out.println("Good morning "+ a + "bro!");
    }
    static void M1(int a, int b){
        System.out.println("Good morning "+ a + "bro!");
        System.out.println("Good morning "+ b + "bro!");
    }

    public static void main(String[] args) {
        M1();
        M1(3000);
        M1(4000,3000);
    }
}
