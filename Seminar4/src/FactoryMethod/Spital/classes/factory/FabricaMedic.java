package FactoryMethod.Spital.classes.factory;

import FactoryMethod.Spital.classes.Medic;
import FactoryMethod.Spital.classes.PersonalSpital;

public class FabricaMedic implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Medic(nume, salariu);
    }
}
