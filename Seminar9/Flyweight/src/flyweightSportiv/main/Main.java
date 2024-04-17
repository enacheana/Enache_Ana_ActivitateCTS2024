package flyweightSportiv.main;

import flyweightSportiv.classes.Caracteristici;
import flyweightSportiv.classes.Fabrica;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica=new Fabrica();
        Caracteristici caracteritici1=new Caracteristici(10, 15, "rosu");
        Caracteristici caracteritici2=new Caracteristici(12, 17, "verde");
        Caracteristici caracteritici3=new Caracteristici(18, 19, "albastru");
        Caracteristici caracteritici4=new Caracteristici(11, 16, "galben");

        fabrica.getSpectator(10, 10).deseneaza(caracteritici1);
        fabrica.getSpectator(20, 10).deseneaza(caracteritici2);
        fabrica.getSpectator(10, 10).deseneaza(caracteritici3);
        fabrica.getSpectator(20, 10).deseneaza(caracteritici4);
    }
}