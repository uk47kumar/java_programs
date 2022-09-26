package com.company;

public class mobileFactory {
    public Mobiles getNewMobiles(String str){
        if(str.equals("expansive"))
            return new iphone();
        else if(str.equals("cheaper"))
            return new onePlus();
        else
            return new realme();
    }
}
