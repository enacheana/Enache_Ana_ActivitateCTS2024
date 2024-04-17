package proxySportiv.classes;

public class VanzareBilet implements IVanzare{
    private String meci;
    private int pret;

    public VanzareBilet(String meci, int pret) {
        this.meci = meci;
        this.pret = pret;
    }

    @Override
    public void vanzare(Persoana persoana) {
        System.out.println("Persoana "+persoana.getNume()+"a cumparat bilet la meciul "+this.meci+"si a platit pretul "+ this.pret);
    }
}
