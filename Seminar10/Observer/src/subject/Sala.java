package subject;

public class Sala extends Subject{


    @Override
    public void notificaMeciFotbal() {
        String mesaj="Va avea loc un meci de fotbal in data de 23 la ora 18!";
        notificaAbonati(mesaj);
    }

    @Override
    public void notificaMeciVolei() {
        String mesaj="Va avea loc un meci de volei in data de 24 la ora 15!";
        notificaAbonati(mesaj);
    }

    @Override
    public void notificaMeciHandball() {
        String mesaj="Va avea loc un meci de handball in data de 25 la ora 17!";
        notificaAbonati(mesaj);
    }
}
