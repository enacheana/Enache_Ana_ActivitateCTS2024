package FactoryMethod.Spital.classes.factory;

import FactoryMethod.Spital.classes.PersonalSpital;

public interface FabricaPersonal {
    public PersonalSpital createPersonal(String nume, int salariu);
}
