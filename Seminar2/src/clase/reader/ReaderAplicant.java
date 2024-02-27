package clase.reader;

import clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class ReaderAplicant {
    public abstract List<Aplicant> readAplicants(String file) throws FileNotFoundException;

    public void readAplicant(Aplicant aplicant, Scanner scanner) {
        aplicant.setNume(scanner.next());
        aplicant.setPrenume(scanner.next());
        aplicant.setVarsta(scanner.nextInt());
        aplicant.setPunctaj(scanner.nextInt());
        int nrProiecte = scanner.nextInt();
        String[] denumiriProiecte = new String[nrProiecte];
        for (int i = 0; i < nrProiecte; i++) {
            denumiriProiecte[i] = scanner.next();
        }
        aplicant.setNr_proiecte(nrProiecte, denumiriProiecte);
    }

}

