package com.company;
import java.util.Scanner;
public class cbse_precentage {
    public static void main(String[] args) {
        System.out.println("All subjects presentage");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Maths marks");
        float a = sc.nextFloat();

        System.out.println("Enter your physics marks");
        float b = sc.nextFloat();

        System.out.println("Enter your chemistry marks");
        float c = sc.nextFloat();

        System.out.println("Enter your hindi marks");
        float d = sc.nextFloat();

        System.out.println("Enter your english marks");
        float e = sc.nextFloat();

        float total_number = a+b+c+d+e;
        System.out.println("your total number is: " + total_number);

        float percentage =(total_number/5);
        System.out.println("Your peresentage is: " + percentage);

    }
}
