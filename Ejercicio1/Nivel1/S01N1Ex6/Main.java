package Nivel1.S01N1Ex6;

public class Main {
    public static void main(String[] args) {
        Frog frog           = new Frog();
        Amphibian Amphibian = (Amphibian) frog;

        Amphibian.mover();
        Amphibian.respirar();
        Amphibian.comer();

        System.out.println("===================");

        Frog Frog         = (Frog) Amphibian;

        frog.mover();
        frog.respirar();
        frog.comer();

    }
}
