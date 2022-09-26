package com.company;

import java.util.Locale;

public class ch_03_string_methods {
    public static void main(String[] args) {
        String name = "Ujjwal";      //starting index is 0
        int value = name.length();
        System.out.println(value);

        String lower = name.toLowerCase();
        System.out.println(lower);

        String upper = name.toUpperCase();
        System.out.println(upper);

        String nonTrimmedString = "      ujjwal      ";
        System.out.println(nonTrimmedString);    //don't remove space

        System.out.println(nonTrimmedString.trim());    //remove space

        System.out.println(name.substring(2));
        System.out.println(name.substring(2,4));  //starting in index no. 2 and end in index no.3

        System.out.println(name.replace('a','k'));  // here for single word replace use single ''
        System.out.println(name.replace("al","iii")); //here for more word replace use double ""

        System.out.println(name.startsWith("Ujj"));
        System.out.println(name.endsWith("al"));

        System.out.println(name.charAt(0));

        System.out.println(name.indexOf("j"));

        System.out.println(name.lastIndexOf("al"));
        System.out.println(name.lastIndexOf("j",2));

        System.out.println(name.equals("Ujjwal"));




    }
}
