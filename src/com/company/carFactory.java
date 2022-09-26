package com.company;

public class carFactory {
    public car getcar(String str){
        if(str.equals("costly"))
            return new ferrari();
        else
            return new bmw();
    }
}
