package clase;

public abstract class Animal implements CanEat{
    private String nume;
    private int age;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String nume, int age) {
        this.nume = nume;
        this.
                age = age;
    }
}

