package Nivel1.S01N1Ex7;

public class Main {
    public static void main(String[] args) {
        Frog frog           = new Frog();
        Amphibian Amphibian = (Amphibian) frog;

        Amphibian.mover();
        Amphibian.respirar();
        Amphibian.comer();
        System.out.println("===================");

        //Amphibian.saltar(); ERROR
        System.out.println("No puede ser llamado el método saltar porque no es hereditario");
        System.out.println("===================");

        Frog Frog         = (Frog) Amphibian;

        frog.mover();
        frog.respirar();
        frog.comer();

        System.out.println("===================");

        frog.saltar();


    }
}
