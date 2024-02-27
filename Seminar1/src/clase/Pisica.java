package clase;

public class Pisica extends Animal{
    public Pisica(String nume, int age) {
        super(nume, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("The pet cat "+this.getNume()+"eats "+food);
    }
}
