package FactoryMethod.Spital.classes;

public class Medic extends PersonalSpital{
    public Medic(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Medicul "+this.getNume()+"are salairul "+this.getSalariu());
    }
}
