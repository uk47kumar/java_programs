package com.company;

public class array {
    public static void main(String[] args) {
        /* classroom of 500 students - you have to store marks of these 500 students
        you have to 2 options:
        1.create 500 variables
        2.use Arrays (recommended)
         */
//        int [] marks = new  int[5];       First method to Declare + Memory allocation the array


        int [] marks;                   //       Second method      --- Declare
        marks = new int[5];         //                              ----Memory allocation
        marks[0] = 100;   //1st
        marks[1] = 90;    //2nd
        marks[2] = 80;    //3rd
        marks[3] = 70;    //4th
        marks[4] = 75;    //5th
//        marks[5] = 65;  This throws error because I declare int is 5    and this is 6th number
        System.out.println(marks[4]);

        int [] marks1 = {34,56,43,67,43};      // Third method      Declare + Initialization
        System.out.println(marks1[3]);
    }
}