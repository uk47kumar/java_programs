package com.company;
import  java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println("Hello,");
        System.out.println(s);

        System.out.println("Enter the first number:");
//        int a = sc.nextInt();
        float a = sc.nextFloat();

        System.out.println("Enter the second number:");
//        int b = sc.nextInt();
        float b = sc.nextFloat();

        float sum = a + b ;

        System.out.println("The sum of first and second number is:");
        System.out.println(sum);
    }
}
