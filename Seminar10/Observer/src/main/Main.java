package main;

import observer.Abonat;
import observer.Observer;
import observer.Vecin;
import subject.Sala;
import subject.Stadion;
import subject.Subject;

public class Main {
    public static void main(String[] args) {
        Observer abonat1=new Abonat("Popescu");
        Observer abonat2=new Abonat("Ionescu");
        Observer abonat3=new Abonat("Xulescu");
        Observer abonat4=new Abonat("Alexandrescu");
        Observer vecin1=new Vecin("Gigel", 12);

        Subject sala=new Sala();
        sala.adaugaAbonat(abonat1);
        sala.adaugaAbonat(abonat2);
        sala.adaugaAbonat(abonat3);
        sala.adaugaAbonat(abonat4);

        sala.notificaMeciFotbal();
        sala.stergeAbonat(abonat4);
        sala.adaugaAbonat(vecin1);
        sala.notificaMeciVolei();

        Subject stadion=new Stadion();
        stadion.adaugaAbonat(abonat1);
        stadion.adaugaAbonat(abonat2);

        ((Stadion)stadion).notificaConcert();
    }
}