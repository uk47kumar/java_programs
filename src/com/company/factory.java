package com.company;

public class factory {
    public static void main(String[] args) {
        mobileFactory obj = new mobileFactory();
        Mobiles obj2 = obj.getNewMobiles("expansive");
        obj2.languageSpec();
    }
}
