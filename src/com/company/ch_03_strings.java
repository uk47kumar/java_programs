package com.company;
import java.util.Scanner;
public class ch_03_strings {
    public static void main(String[] args) {
        String name= "ujjwal";
        System.out.print("My name is: ");
        System.out.println(name);
        int a = 4;
        float b = 5.3453f;
        System.out.printf("The value of a is %d and value of b is %8.2f\n", a,b);

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);
    }
}
