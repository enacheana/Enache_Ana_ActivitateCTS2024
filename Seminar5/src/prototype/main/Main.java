package prototype.main;

import prototype.classes.Reteta;
import prototype.classes.RetetaAbstracta;
import prototype.classes.RetetaCrema;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args)throws CloneNotSupportedException {
        Map<String, Double> solutii1=new HashMap<>();
        solutii1.put("acetilcolina", 21.03);
        solutii1.put("amoxicilina", 20.03);
        solutii1.put("acid acetilsalicilic", 31.03);
        Reteta prototip=new Reteta(solutii1, "Medicament1");

        RetetaAbstracta reteta2= prototip.clone();
        System.out.println(reteta2);

        RetetaCrema retetaCremaPrototip=new RetetaCrema("Crema1", 50);
        RetetaCrema retetaCrema= (RetetaCrema) retetaCremaPrototip.clone();
        System.out.println(retetaCrema);
    }
}