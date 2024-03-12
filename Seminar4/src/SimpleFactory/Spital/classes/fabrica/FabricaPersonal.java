package SimpleFactory.Spital.classes.fabrica;

import SimpleFactory.Spital.classes.*;

public class FabricaPersonal {
    public PersonalSpital createPersonal(TipPersonal tipPersonal, String nume, int salariu)throws Exception{
        switch(tipPersonal){
            case MEDIC :
                return new Medic(nume, salariu);
            case ASISTENT:
                return new Asistent(nume, salariu);
            case BRANCARDIER:
                return new Brancardier(nume, salariu);
            case INFIRMIER:
                return new Infirmier(nume, salariu);
            default:
                throw new Exception("Tipul nu este returnat");
        }
    }
}
