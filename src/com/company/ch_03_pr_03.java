package com.company;

public class ch_03_pr_03 {
    public static void main(String[] args) {
//        problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","ujjwal");
        System.out.println(letter);

//        problem 4
        String mystring = "This string contains  double spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("    "));

//        problem 5
        String a = "Dear harry,\n\tThis java course is nice.\nThanks!";
        System.out.println(a);

    }
}
