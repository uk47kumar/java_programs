package com.company;

public class methods_array {
    static void change1(int a){
        a=54;
    }
    static void change2(int [] arr){
        arr[0] = 86;
    }

    public static void main(String[] args) {
//        case Ist changing the integer in the array but the array could'nt change
        int [] marks1 = {45,54,36,75,45};
        int x=45;
        change1(x);
        System.out.println("The vale of x after running change- "+ x);

//        case IInd changing the array
        int [] marks2 = {45,54,36,75,45};
        change2(marks2);
        System.out.println("The vale of x after running change- "+ marks2[0]);
    }
}
