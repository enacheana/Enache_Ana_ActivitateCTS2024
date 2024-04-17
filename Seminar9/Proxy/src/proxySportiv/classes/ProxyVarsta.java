package proxySportiv.classes;

public class ProxyVarsta implements IVanzare{
    private IVanzare vanzareBilet;
    private static int varstaMinima=14;


    public ProxyVarsta(IVanzare vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }
    public static void setVarstaMinima(int varstaMinima) {
        ProxyVarsta.varstaMinima = varstaMinima;
    }

    @Override
    public void vanzare(Persoana persoana) {
        if(persoana.getVarsta()>=14){
            vanzareBilet.vanzare(persoana);
        }else{
            System.out.println("Persoana are varsta de "+ persoana.getVarsta()+ " ani si nu poate achizitiona biletul!");
        }
    }
}
