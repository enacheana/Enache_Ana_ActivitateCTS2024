package FactoryMethod.Spital.classes.factory;

import FactoryMethod.Spital.classes.Brancardier;
import FactoryMethod.Spital.classes.PersonalSpital;

public class FabricaBrancardier implements FabricaPersonal {
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Brancardier(nume, salariu);
    }
}
