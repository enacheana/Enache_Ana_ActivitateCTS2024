package Decorator;

import Spital.DiagnosticAbstract;

public abstract class Decorator implements DiagnosticAbstract {
    protected DiagnosticAbstract diagnostic;
    public abstract void afiseazaOnline();

    public Decorator(DiagnosticAbstract diagnostic) {
        this.diagnostic = diagnostic;
    }

    public Decorator() {
        super();
    }

    @Override
    public String getNumeDiagnostic() {
        return diagnostic.getNumeDiagnostic();
    }

    @Override
    public String getSimptome() {
        return diagnostic.getSimptome();
    }

    @Override
    public boolean isNecesitaSpitalizare() {
        return false;
    }

    @Override
    public void printeazaDiagnositc() {
        diagnostic.printeazaDiagnositc();
        System.out.println("\nRezultatul este disponibil si pe platforma!");
    }
}
