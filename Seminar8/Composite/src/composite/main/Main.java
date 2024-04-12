package composite.main;

import composite.clase.Departament;
import composite.clase.Sectie;
import composite.clase.StructuraAbstracta;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta cardiologie=new Departament("Cardiologie", "Gigel");
        StructuraAbstracta oftalmologie=new Departament("Oftalmologie", "Vasile");

        StructuraAbstracta terapieIntensiva=new Sectie("ATI ", 10, "Ion");
        StructuraAbstracta donare=new Sectie("Donare de sange ", 5, "Marin");
        StructuraAbstracta optometrie=new Sectie("Optometrie ", 3, "Gherorghe");

        cardiologie.adaugaStructura(terapieIntensiva);
        cardiologie.adaugaStructura(donare);
        oftalmologie.adaugaStructura(optometrie);

        StructuraAbstracta spital=new Departament("Spital", "Popescu");
        spital.adaugaStructura(oftalmologie);
        spital.adaugaStructura(cardiologie);

        spital.afiseazaDescriere("  ");    }
}