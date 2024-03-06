package SingletonRegistry.SustinereExamen.classes;

public class Student {
    private int id;
    private String nume;
    private String email;
    private int an;

    public Student(int id, String nume, String email, int an) {
        this.id = id;
        this.nume = nume;
        this.email = email;
        this.an = an;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("id=").append(id);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", an=").append(an);
        sb.append('}');
        return sb.toString();
    }
}
