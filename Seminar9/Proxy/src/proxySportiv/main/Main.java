package proxySportiv.main;

import proxySportiv.classes.*;

public class Main {
    public static void main(String[] args) {
        VanzareBilet vanzareBilet= new VanzareBilet("El Clasico ", 100);
        Persoana persoana1=new Persoana("Andrei ", 21, "masculin");
        Persoana persoana2=new Persoana("Mihai ", 12, "masculin");
        Persoana persoana3=new Persoana("Andreea ", 13, "feminin");

        vanzareBilet.vanzare(persoana1);
        vanzareBilet.vanzare(persoana2);

        IVanzare proxyVarsta=new ProxyVarsta(vanzareBilet);
        proxyVarsta.vanzare(persoana1);
        proxyVarsta.vanzare(persoana2);

        IVanzare proxyGen=new ProxyGen(proxyVarsta, "feminin");
        proxyGen.vanzare(persoana1);
        proxyGen.vanzare(persoana2);
        proxyGen.vanzare(persoana3);
    }
}