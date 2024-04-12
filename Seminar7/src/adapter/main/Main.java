package adapter.main;

import adapter.softNou.Bar;
import adapter.softNou.Bautura;
import adapter.softVechi.Bucatarie;
import adapter.softVechi.Produs;
import adapter.softVechi.SoftBucatarie;

public class Main {
    public static void platesteConsumatie(SoftBucatarie comanda){
        comanda.printareBon();
    }

    public static void main(String[] args) {
        SoftBucatarie bucatarie=new Bucatarie();
        Produs produs1=new Produs("Pizza", 25);
        Produs produs2=new Produs("Paste", 35);
        bucatarie.adaugareProdus(produs1);
        bucatarie.adaugareProdus(produs2);

        bucatarie.printareBon();

        platesteConsumatie(bucatarie);

        Bar bar=new Bar();
        bar.adaugaBautura(new Bautura(12, "Cola", 0));
        Bautura bautura=new Bautura(25, "Mojito", 25.5F);
        bar.adaugaBautura(bautura);
    }
}