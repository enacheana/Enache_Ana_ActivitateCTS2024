package FactoryMethod.Spital.classes.factory;

import FactoryMethod.Spital.classes.Asistent;
import FactoryMethod.Spital.classes.PersonalSpital;

public class FabricaAsistent implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Asistent(nume, salariu);
    }
}
