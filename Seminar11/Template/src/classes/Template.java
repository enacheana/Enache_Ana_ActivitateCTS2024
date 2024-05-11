package classes;

import java.util.HashMap;
import java.util.Map;

public abstract class Template {
    protected Map<String, Integer> stocuri;

    public Template() {
        this.stocuri = new HashMap<>();
        stocuri.put("Paracetamol Sinus", 10);
        stocuri.put("Nurofen", 10);
        stocuri.put("Algocalmin", 10);
    }

    public final void cumparaMedicament() {
        primireReteta();
        if (verificareStoc()) {
            aduceMedicamente();
            incaseaza();
            emiteBon();
        } else {
            respingeAchizitia();
        }
    }

    protected abstract void primireReteta();

    protected abstract boolean verificareStoc();

    protected abstract void aduceMedicamente();

    protected abstract void emiteBon();

    protected abstract void respingeAchizitia();

    protected abstract void incaseaza();
}
