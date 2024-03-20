package builder.classes;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new PacientBuilder()
                .setPatRabatabil(true)
                .setHalatInterior(true)
                .setPapuci(true)
                .setMicDeJunInclus(false)
                .build();

        Pacient pacient2=new PacientBuilder().setPatRabatabil(true).build();
        System.out.println(pacient);
        System.out.println(pacient2);

        builder.classes.builder_v3.Pacient pacientBuilder=new builder.classes.builder_v3.Pacient();
        builder.classes.builder_v3.Pacient pacient3=pacientBuilder
                .setPatRabatabil(true)
                .setPapuci(true)
                .setMicDeJunInclus(true)
                .sethalatInterior(true)
                .build();
        System.out.println(pacient3.toString());
    }
}
