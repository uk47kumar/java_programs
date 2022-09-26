package com.company;
import java.util.Scanner;

public class switch_cases {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();
        switch (age) {
            case 18 -> System.out.println("you are going to be an adult");
            case 23 -> System.out.println("you are going to join a job");
            case 60 -> System.out.println("you are going to be retired");
            default -> System.out.println("Enjoy tour life");
        }
    }
}
