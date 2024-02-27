package main;

import clase.Angajat;
import clase.Aplicant;
import clase.reader.ReaderAngajat;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        ReaderAngajat readerAngajat = new ReaderAngajat();
        List<Aplicant> listaAngajati;
        try {
            listaAngajati = readerAngajat.readAplicants("angajati.txt");
            Angajat.setSumaFinantare(100);
            for(Aplicant angajat:listaAngajati) {
                System.out.println(angajat.toString());
                angajat.AfisareSumaFinantare();
                angajat.AfisareStatus();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
