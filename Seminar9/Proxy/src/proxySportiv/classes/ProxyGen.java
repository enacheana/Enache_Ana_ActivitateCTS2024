package proxySportiv.classes;

public class ProxyGen implements IVanzare{
    private IVanzare vanzare;
    private String genAcceptat;

    public ProxyGen(IVanzare vanzare, String genAcceptat) {
        this.vanzare = vanzare;
        this.genAcceptat = genAcceptat;
    }

    @Override
    public void vanzare(Persoana persoana) {
        if(persoana.getGen().equals(genAcceptat)){
            vanzare.vanzare(persoana);
        }else{
            System.out.println("Acest eveniment este destinat doar persoanelor de gen: "+genAcceptat);
        }
    }
}
