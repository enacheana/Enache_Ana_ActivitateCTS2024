package Decorator;

import Spital.DiagnosticAbstract;

public class Website extends Decorator{
    public Website(DiagnosticAbstract diagnostic) {
        super(diagnostic);
    }
    @Override
    public void afiseazaOnline() {
        System.out.println("In cadrul website ati primit diagnosticul: "+super.getNumeDiagnostic()+" cu simptomele: "+super.getSimptome()+" si "+(super.isNecesitaSpitalizare()?"":" nu "+ "aveti nevoie de spitalizare "));
    }
}
