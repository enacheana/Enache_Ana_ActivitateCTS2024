package SingletonRegistry.SustinereExamen.main;

import SingletonRegistry.SustinereExamen.classes.Student;
import SingletonRegistry.SustinereExamen.classes.SustinereExamen;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student(111, "Ion ", "email1", 2);
        Student student2=new Student(222, "Mihai ", "email2", 3);
        Student student3=new Student(333, "Alexandra ", "email3", 1);
        Student student4=new Student(444, "Denis ", "email4", 2);

        SustinereExamen examenPoo= new SustinereExamen("Programare Orientat Obiect");
        SustinereExamen examenCts= new SustinereExamen("Calitate si testare software");

        examenPoo.inregistrareStudent(student1);
        examenPoo.inregistrareStudent(student2);
        examenPoo.inregistrareStudent(student1);
        examenPoo.inregistrareStudent(student3);
        examenPoo.inregistrareStudent(student4);
        examenPoo.inregistrareStudent(student2);
    }
}
