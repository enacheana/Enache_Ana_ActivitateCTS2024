package builder.classes;

public class PacientBuilder implements Builder{
    Pacient pacient;

    public PacientBuilder() {
        pacient = new Pacient(false, false, false, false);
    }

    PacientBuilder setPacient(Pacient pacient) {
        this.pacient = pacient;
        return this;
    }

    public PacientBuilder setPatRabatabil(boolean patRabatabil) {
        this.pacient.setPatRabatabil(patRabatabil);
        return this;
    }

    public PacientBuilder setPapuci(boolean papuci) {
        this.pacient.setPatRabatabil(papuci);
        return this;
    }

    public PacientBuilder setMicDeJunInclus(boolean micDeJunInclus) {
        this.pacient.setMicDeJunInclus(micDeJunInclus);
        return this;
    }

    public PacientBuilder setHalatInterior(boolean halat) {
        this.pacient.setHalatInterior(halat);
        return this;
    }

    @Override
    public Pacient build() {
        return null;
    }
}
