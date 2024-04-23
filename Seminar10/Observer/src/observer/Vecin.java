package observer;

public class Vecin implements Observer {
    private String nume;
    private float distantaBloc;

    public Vecin(String nume, float distantaBloc) {
        this.nume = nume;
        this.distantaBloc = distantaBloc;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(nume+" sala aflata la o distanta de "+ distantaBloc + " metri de tine, a trimit catre abonati urmatorul mesaj: "+ mesaj);
    }
}
