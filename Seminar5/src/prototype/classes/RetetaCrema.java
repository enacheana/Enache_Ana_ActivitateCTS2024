package prototype.classes;

public class RetetaCrema implements RetetaAbstracta{
    private String denumire;
    private float cantitate;

    public RetetaCrema(String denumire, float cantitate) {
        this.denumire = denumire;
        this.cantitate = cantitate;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public float getCantitate() {
        return cantitate;
    }

    public void setCantitate(float cantitate) {
        this.cantitate = cantitate;
    }
    public RetetaCrema()
    {
        this.denumire="RetetaNecunoscuta";
        this.cantitate=0;
    }

    @Override
    public RetetaAbstracta clone() {
        RetetaCrema retetaCrema=new RetetaCrema();
        retetaCrema.setCantitate(this.cantitate);
        retetaCrema.setDenumire(this.denumire);
        return retetaCrema;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

