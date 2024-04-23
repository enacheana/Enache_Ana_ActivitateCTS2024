package strategySportiv.main;

import strategySportiv.classes.Portar;
import strategySportiv.classes.VerificatorPeluza;
import strategySportiv.classes.VerificatorTribuna;
import strategySportiv.classes.VerificatorVIP;

public class Main {
    public static void main(String[] args) {
        Portar portar=new Portar();
        String suporter1="Gigel VIP";
        String suporter2="Gigel Tribuna";
        String suporter3="Gigel Peluza";

        portar.setStrategie(new VerificatorVIP());
        portar.verificaSuporter(suporter1);

        portar.setStrategie(new VerificatorTribuna());
        portar.verificaSuporter(suporter2);

        portar.setStrategie(new VerificatorPeluza());
        portar.verificaSuporter(suporter3);
    }
}