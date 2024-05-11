package classes;

public class AchizitieMedicamentePeBazaDeReteta extends Template {
    private String denumireMedicament;

    public AchizitieMedicamentePeBazaDeReteta(String denumireMedicament) {
        super();
        this.denumireMedicament = denumireMedicament;
    }

    @Override
    protected void primireReteta() {
        System.out.println("Am primit reteta pentru medicamentul " + denumireMedicament);
    }

    @Override
    protected boolean verificareStoc() {
        return super.stocuri.containsKey(denumireMedicament);
    }

    @Override
    protected void incaseaza() {
        System.out.println("Am incasat banii pentru medicamentul " + denumireMedicament);
    }

    @Override
    protected void aduceMedicamente() {
        System.out.println("Medicamentul " + denumireMedicament + " este adus din depozit");

        if (super.stocuri.get(denumireMedicament) > 1) {

            super.stocuri.replace(denumireMedicament, super.stocuri.get(denumireMedicament) - 1);

        } else {
            super.stocuri.remove(denumireMedicament);
        }
    }

    @Override
    protected void emiteBon() {

        System.out.println("Bonul a fost emis");
    }

    @Override
    protected void respingeAchizitia() {

        System.out.println("Achzitia a fost respinsa");
    }
}
