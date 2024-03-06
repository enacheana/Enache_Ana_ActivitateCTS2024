package Singleton.main;

import Singleton.classes.ConexiuneBazeDeDate;

public class Main {
    public static void main(String[] args) {
        ConexiuneBazeDeDate conexiuneBazaDeDate1=ConexiuneBazeDeDate.getInstance("Baza1", 10, "link1");
        ConexiuneBazeDeDate conexiuneBazaDeDate2=ConexiuneBazeDeDate.getInstance("Baza2", 20, "link2");

        conexiuneBazaDeDate1.setNumeBaza("NumeBazaNou");
        conexiuneBazaDeDate2.setNumeBaza("NumeBazaNou2");

        System.out.println(conexiuneBazaDeDate1);
        System.out.println(conexiuneBazaDeDate2);

    }
}
