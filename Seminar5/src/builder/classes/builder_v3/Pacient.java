package builder.classes.builder_v3;


public class Pacient implements IBuilderV3 {
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

    public Pacient() {
    }

    public Pacient setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public boolean isPapuci() {
        return papuci;
    }

    public Pacient setPapuci(boolean papuci) {
        this.papuci = papuci;
        return this;
    }

    public boolean isMicDeJunInclus() {
        return micDeJunInclus;
    }

    public Pacient setMicDeJunInclus(boolean micDeJunInclus) {
        this.micDeJunInclus = micDeJunInclus;
        return this;
    }

    public boolean isHalatInterior() {
        return halatInterior;
    }

    public Pacient sethalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
        return this;
    }
    @Override
    public Pacient build() {
        return new Pacient(patRabatabil, micDeJunInclus, papuci, halatInterior);
    }
}
