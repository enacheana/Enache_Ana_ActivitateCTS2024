package Spital;

public class Diagnostic implements  DiagnosticAbstract{
    private String numeDiagnostic;
    private String simptome;
    private boolean necesitaSpitalizare;

    public Diagnostic(String numeDiagnostic, String simptome, boolean necesitaSpitalizare) {
        this.numeDiagnostic = numeDiagnostic;
        this.simptome = simptome;
        this.necesitaSpitalizare = necesitaSpitalizare;
    }


    @Override
    public void printeazaDiagnositc() {
        System.out.printf("Numele diagnosticului: "+this.numeDiagnostic+" , care are simptomele: "+this.simptome+ " si " + ((necesitaSpitalizare)?" ": " nu")+" necesita spitalizare");
    }

    @Override
    public String getNumeDiagnostic() {
        return numeDiagnostic;
    }

    @Override
    public String getSimptome() {
        return simptome;
    }

    @Override
    public boolean isNecesitaSpitalizare() {
        return necesitaSpitalizare;
    }
}
