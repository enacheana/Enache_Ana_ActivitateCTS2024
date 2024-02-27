package clase;

public class Zebra extends Animal{
    public Zebra(String nume, int age) {
        super(nume, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("The zebra " + this.getNume()+"eats "+food);
    }
}
