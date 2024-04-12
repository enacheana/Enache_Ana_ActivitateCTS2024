package Main;

import Decorator.Decorator;
import Spital.Diagnostic;
import Spital.DiagnosticAbstract;
import Decorator.AplicatieMobila;
import Decorator.Website;

public class Main {
    public static void main(String[] args) {
        DiagnosticAbstract diagnostic=new Diagnostic("Raceala", "rosu in gat", false);
        diagnostic.printeazaDiagnositc();

        Decorator decorator=new AplicatieMobila(diagnostic);
        decorator.afiseazaOnline();
        decorator.printeazaDiagnositc();

        Decorator website=new Website(diagnostic);
        website.afiseazaOnline();
        website.printeazaDiagnositc();
    }
}