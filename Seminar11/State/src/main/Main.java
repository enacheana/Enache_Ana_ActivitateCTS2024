package main;

import classes.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta(12, 23, 45);
        reteta.cumparareMedicamente();
        reteta.cumparareMedicamente();
        reteta.cerereMedicamente();
        reteta.respingereReteta();
        reteta.cerereMedicamente();
        reteta.cumparareMedicamente();
    }
}