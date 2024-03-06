package Singleton.classes;

public class ConexiuneBazeDeDate {
    private String numeBaza;
    private int nrTabele;
    private String linkConexiune;
    private static ConexiuneBazeDeDate instanta=null;

    private ConexiuneBazeDeDate(String numeBaza, int nrTabele, String linkConexiune) {
        this.numeBaza = numeBaza;
        this.nrTabele = nrTabele;
        this.linkConexiune = linkConexiune;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ConexiuneBazaDeDate{");
        sb.append("numeBaza='").append(numeBaza).append('\'');
        sb.append(", nrTabele=").append(nrTabele);
        sb.append(", linkConexiune='").append(linkConexiune).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static synchronized ConexiuneBazeDeDate getInstance(String numeBaza, int nrTabele, String linkConexiune){
        if(instanta==null) {
            instanta = new ConexiuneBazeDeDate(numeBaza, nrTabele, linkConexiune);
        }
        return instanta;

    }

    public String getNumeBaza() {
        return numeBaza;
    }

    public void setNumeBaza(String numeBaza) {
        this.numeBaza = numeBaza;
    }

    public int getNrTabele() {
        return nrTabele;
    }

    public void setNrTabele(int nrTabele) {
        this.nrTabele = nrTabele;
    }

    public String getLinkConexiune() {
        return linkConexiune;
    }

    public void setLinkConexiune(String linkConexiune) {
        this.linkConexiune = linkConexiune;
    }
}
