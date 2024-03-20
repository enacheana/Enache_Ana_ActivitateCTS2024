package builder.classes;

public class Pacient {
    private boolean patRabatabil;
    private boolean papuci;
    private boolean micDeJunInclus;

    private boolean halatInterior;

    public Pacient(boolean patRabatabil, boolean papuci, boolean micDeJunInclus, boolean halatInterior) {
        this.patRabatabil = patRabatabil;
        this.papuci = papuci;
        this.micDeJunInclus = micDeJunInclus;
        this.halatInterior = halatInterior;
    }

    public boolean isPatRabatabil() {
        return patRabatabil;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public boolean isPapuci() {
        return papuci;
    }

    public void setPapuci(boolean papuci) {
        this.papuci = papuci;
    }

    public boolean isMicDeJunInclus() {
        return micDeJunInclus;
    }

    public void setMicDeJunInclus(boolean micDeJunInclus) {
        this.micDeJunInclus = micDeJunInclus;
    }

    public boolean isHalatInterior() {
        return halatInterior;
    }

    public void setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "patRabatabil=" + patRabatabil +
                ", papuci=" + papuci +
                ", micDeJunInclus=" + micDeJunInclus +
                ", halatInterior=" + halatInterior +
                '}';
    }
}
