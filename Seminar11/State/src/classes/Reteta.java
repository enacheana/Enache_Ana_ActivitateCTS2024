package classes;

public class Reteta {
    private int nrMedicamente;
    private float pret;
    private int nrReteta;
    private AbstractState stare;

    public Reteta(int nrMedicamente, float pret, int nrReteta) {
        this.nrMedicamente = nrMedicamente;
        this.pret = pret;
        this.nrReteta = nrReteta;
        this.stare = new Emisa();
    }

    //public Reteta() {
    //}

    public int getNrMedicamente() {
        return nrMedicamente;
    }

    public void setNrMedicamente(int nrMedicamente) {
        this.nrMedicamente = nrMedicamente;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public int getNrReteta() {
        return nrReteta;
    }

    public void setNrReteta(int nrReteta) {
        this.nrReteta = nrReteta;
    }

    protected void setStare(AbstractState stare) {
        this.stare = stare;//la state seterul este protected
    }

    public void cerereMedicamente() {
        if (stare instanceof Emisa) {
            System.out.println("Au fost solicitate " + nrMedicamente + " in baza retetei cu numarul 123");
            AbstractState solicitate = new Solicitata();
            solicitate.schimbaStare(this);
        } else {
            System.out.println("Nu puteti achizitiona medicamente in baza acestei retete");
        }
    }

    public void cumparareMedicamente() {
        if (stare instanceof Solicitata) {
            System.out.println("Au fost achizitionate " + nrMedicamente + " in baza retetei  cu nr 122" + nrReteta);
            AbstractState achizitionate = new Achizitionata();
            achizitionate.schimbaStare(this);
        } else {
            System.out.println("Nu puteti achizitiona medicamente in baza acestei retete");
        }
    }

    public void respingereReteta() {
        if (stare instanceof Solicitata) {
            System.out.println("Nu avem aceste medicamente pe stoc");
            AbstractState emisa = new Emisa();
            emisa.schimbaStare(this);
        } else {
            System.out.println("Reteta nu a fost solicitata");
        }
    }
}
