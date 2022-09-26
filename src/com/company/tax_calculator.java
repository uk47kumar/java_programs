package com.company;
import java.util.Scanner;
public class tax_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();

        if(income<=2.5f){
            tax = tax + 0;
        }
        else if (income>2.5f && income<=5f){
            tax = tax + 0.05f * (income-2.5f);
        }
        else if (income>5f && income<=10.0f){
            tax = tax + 0.05f * (5.0f-2.5f);
            tax = tax + 0.2f * (income-5f);
        }
        else if (income>10.0f){
            tax = tax + 0.05f * (5.0f-2.5f);
            tax = tax + 0.2f * (10.0f-5f);
            tax = tax + 0.3f * (income-10.0f);
        }
        System.out.print("The total tax paid by the employee is: " + tax);
        System.out.println(" lakhs");

        //Question 4

        System.out.println("Enter your day no. 1 to 7");
        int day = sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
