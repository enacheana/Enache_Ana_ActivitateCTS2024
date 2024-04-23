package subject;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observeri;

    public Subject() {
        this.observeri = new ArrayList<>();
    }

    public void adaugaAbonat(Observer observer){
        observeri.add(observer);
    }
    public void stergeAbonat(Observer observer){
        observeri.remove(observer);
    }
    public void notificaAbonati(String mesaj){
        for(Observer observer:observeri){
            observer.primesteNotificare(mesaj);
        }
    }

    public abstract void notificaMeciFotbal();
    public abstract void notificaMeciVolei();
    public abstract void notificaMeciHandball();
}

