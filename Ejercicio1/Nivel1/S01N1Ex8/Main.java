package Nivel1.S01N1Ex8;

public class Main {
    public static void main(String[] args) {
        Frog frog           = new Frog();
        Amphibian Amphibian = (Amphibian) frog;

        Amphibian.mover();
        Amphibian.respirar();
        Amphibian.comer();
        System.out.println("===================");

        Amphibian Amphibian1 = new Amphibian();
        Amphibian1.mover();
        Amphibian1.respirar();
        Amphibian1.comer();
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
