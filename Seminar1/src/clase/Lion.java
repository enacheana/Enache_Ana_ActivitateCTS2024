package clase;

public class Lion extends Animal{
    public Lion(String nume, int age) {
        super(nume, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("Lion "+ this.getNume()+"eats "+food);
    }
}
