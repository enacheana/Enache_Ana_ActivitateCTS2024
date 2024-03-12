package FactoryMethod.Spital.classes.factory;

import FactoryMethod.Spital.classes.Infirmier;
import FactoryMethod.Spital.classes.PersonalSpital;

public class FabricaInfirmier implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Infirmier(nume, salariu);
    }
}
