package com.company;
import java.util.Scanner;
public class ch_04_pr {
    public static void main(String[] args) {
        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Mathematics");
        m1 = sc.nextByte();
        System.out.println("Enter your marks in Physics");
        m2 = sc.nextByte();
        System.out.println("Enter your marks in Chemistry");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("your overall percentage is: " + avg);

        if(avg>=40 && m1>=33 && m2>=33 && m3>=33 ){
            System.out.println("Congratulation you have been promoted");
        }
        else{
            System.out.println("Sorry, you have not been promoted! please try again. ");
        }
    }
}
