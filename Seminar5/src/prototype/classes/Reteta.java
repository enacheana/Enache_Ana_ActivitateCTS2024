package prototype.classes;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements RetetaAbstracta{
    private Map<String, Double> solutii;
    private String denumireMedicament;

    public Reteta(Map<String, Double> solutii, String denumireMedicament) {
        this.solutii = solutii;
        this.denumireMedicament = denumireMedicament;
    }

    public Map<String, Double> getSolutii() {
        return solutii;
    }

    public void setSolutii(Map<String, Double> solutii) {
        this.solutii = new HashMap<>();
        for(String solutie : solutii.keySet()){
            this.solutii.put(solutie, solutii.get(solutie));
        }
    }

    public String getDenumireMedicament() {
        return denumireMedicament;
    }

    public void setDenumireMedicament(String denumireMedicament) {
        this.denumireMedicament = denumireMedicament;
    }

    public Reteta(){
        denumireMedicament="Nou";
        solutii=null;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Reteta{");
        sb.append("solutii=").append(solutii);
        sb.append(", denumireMedicament='").append(denumireMedicament).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public RetetaAbstracta clone() {
        Reteta abstracta=new Reteta();
        abstracta.setSolutii(this.solutii);
        abstracta.setDenumireMedicament(this.denumireMedicament);
        return abstracta;
    }
}
