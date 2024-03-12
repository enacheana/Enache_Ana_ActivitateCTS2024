package SimpleFactory.Spital.main;

import SimpleFactory.Spital.classes.PersonalSpital;
import SimpleFactory.Spital.classes.fabrica.FabricaPersonal;
import SimpleFactory.Spital.classes.fabrica.TipPersonal;

public class Main {
    public static void main(String[] args) {
        FabricaPersonal fabricaPersonal=new FabricaPersonal();
        try{
            PersonalSpital medic=fabricaPersonal.createPersonal(TipPersonal.MEDIC, "Popescu Maria ", 7000);
            PersonalSpital asistent=fabricaPersonal.createPersonal(TipPersonal.ASISTENT, "Ionescu Andrei ", 5000);
            PersonalSpital brancardier=fabricaPersonal.createPersonal(TipPersonal.BRANCARDIER, "Florea Marin ", 4000);

            medic.afisareDetalii();
            asistent.afisareDetalii();
            brancardier.afisareDetalii();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}