package FactoryMethod.Spital.classes;

public class Brancardier extends PersonalSpital{
    public Brancardier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Brancardierul "+this.getNume()+"are salariul "+this.getSalariu());
    }
}
