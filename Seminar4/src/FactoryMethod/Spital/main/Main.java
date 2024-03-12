package FactoryMethod.Spital.main;

import FactoryMethod.Spital.classes.PersonalSpital;
import FactoryMethod.Spital.classes.factory.*;

public class Main {
    public static void prelucrarePersonal(FabricaPersonal fabrica, String nume, int salariu){
        PersonalSpital personal=fabrica.createPersonal(nume, salariu);
        personal.afiseazaDetalii();
    }
    public static void main(String[] args) {
        FabricaPersonal fabricaMedic=new FabricaMedic();
        FabricaPersonal fabricaAsistent=new FabricaAsistent();
        FabricaPersonal fabricaBrancardier=new FabricaBrancardier();

        PersonalSpital medic=fabricaMedic.createPersonal("Popescu Maria ", 7000);
        PersonalSpital asistent=fabricaAsistent.createPersonal("Ionescu Andrei ", 5000);
        PersonalSpital brancardier=fabricaBrancardier.createPersonal("Florea Marin ", 4000);

        medic.afiseazaDetalii();
        asistent.afiseazaDetalii();
        brancardier.afiseazaDetalii();

        prelucrarePersonal(new FabricaMedic(), "Butacu Marin ", 6000);
        prelucrarePersonal(new FabricaInfirmier(), "Irina Lazar ", 3900);
    }
}
