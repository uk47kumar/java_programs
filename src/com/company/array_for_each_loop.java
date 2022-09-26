package com.company;

public class array_for_each_loop {
    public static void main(String[] args) {
        int [] marks = {34,56,43,67,43};      // Third method      Declare + Initialization
//        System.out.println(marks.length);

        System.out.println("Traversing array in forward direction");
        for (int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        System.out.println("Traversing array in reverse order");
        for (int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }

        System.out.println("printing using for-each loop");
        for (int element : marks){
            System.out.println(element);
        }
    }
}
