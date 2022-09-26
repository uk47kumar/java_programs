package com.company;

public class fact {
    public static void main(String[] args) {
        carFactory obj = new carFactory();
        car obj2 = obj.getcar("costly");
        obj2.cost();
    }
}
